package com.controller;

import com.bean.*;
import com.service.OrderDetailService;
import com.service.OrderRecipientsService;
import com.service.OrderService;
import com.service.ShopitemsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * @Author: zhuda
 * @Description:
 * @Date: Create in 14:13 2019/7/10
 */
@Controller
public class OrderController {

    @Resource(name = "orderRecipientsServiceImp")
    OrderRecipientsService orderRecipientsService;

    @Resource(name = "shopitemsServiceImp")
    ShopitemsService shopitemsService;

    @Resource(name = "orderDetailServiceImp")
    OrderDetailService orderDetailService;


    @Resource(name = "orderServiceImp")
    OrderService orderService;

    @RequestMapping("/is/addorder")
    public String addOrder(HttpServletRequest request, Orders orders, int orderaddressid, int[] shopid) {
        //获取提交订单选中的地址id --- orderaddress
        System.out.println("获取提交订单选中的地址id：" + orderaddressid);
        //获取购物车中选中的商品id

        int usersid = ((Users) request.getSession().getAttribute("nowuser"))
                .getUserId();//当前用户的id

        String uuid = UUID.randomUUID().toString().replaceAll("-","");//订单ID

        //根据购物车的ID号数组shopid[] 获取购物车集合
        List<Shopitems> shopitemsList = shopitemsService.selectByArrid(
                Arrays.toString(shopid).replace("[", "").replace("]", ""),0);

        //根据购物车集合对象获取订单明细集合
        float fsum = 0;
        List<OrderDetail> detailList = new ArrayList<>();
        for (Shopitems shopitems : shopitemsList) {
            OrderDetail detail = new OrderDetail();//订单明细集合
            detail.setDetailGoods(shopitems.getItemGoods());
            detail.setDetailNum(shopitems.getItemNum());
            detail.setDetailPrice(shopitems.getItemPrice().floatValue());
            detail.setDetailOrder(uuid);
            fsum += shopitems.getItemPrice().floatValue() * shopitems.getItemNum();//总价
            detailList.add(detail);
        }

        //根据提交订单选中的地址获取地址
        OrderRecipients orderRecipients = orderRecipientsService.selectByPrimaryKey(orderaddressid);
        orders.setOrderUser(usersid);
        orders.setOrderId(uuid);
        orders.setOrderAddress(orderRecipients.getRecipientsAddress());
        orders.setOrderPhone(orderRecipients.getRecipientsPhone());
        orders.setOrderName(orderRecipients.getRecipientsName());
        orders.setOrderStatus(1);
        orders.setOrderTime(new Date());
        orders.setOrderPrice(fsum+0d);

        orderService.insert(orders, detailList,shopitemsList);
        request.setAttribute("fsum", fsum);
        request.setAttribute("uuid", uuid);

        return "cartpay";
    }


    // 删除订单
    @RequestMapping("/is/cancel")
    public String cancelorder(HttpServletRequest req, String uuid) {

        List<OrderDetail> list = orderDetailService.selectdetailId(uuid);
        for (OrderDetail integer : list) {
            orderDetailService.deleteByPrimaryKey(integer.getDetailId());
        }
        System.out.println("订单地址是：" + uuid);
        orderService.deleteorderById(uuid);

        return "deletesuccess";
    }
}
