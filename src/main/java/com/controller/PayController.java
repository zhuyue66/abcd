package com.controller;

import com.bean.OrderRecipients;
import com.bean.Users;
import com.service.OrderRecipientsService;
import com.service.PayService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @Author: zhuda
 * @Description:
 * @Date: Create in 16:18 2019/7/9
 */
@Controller

public class PayController {
    @Resource(name = "payServiceImp")
    PayService payService;


    @Resource(name = "orderRecipientsServiceImp")
    OrderRecipientsService orderRecipientsService;

    /**
     * 结算
     */
    @RequestMapping("/is/shoppay")
    public String shopPay(int[] ck, HttpServletRequest req) {
        // 1、获取购物车里面提交选中的购物车对象的id号 、ck是选择购物车的id号数组
        int usersid = ((Users) req.getSession().getAttribute("nowuser"))
                .getUserId();//当前用户的id

        //获取当前用户提交购物车提交结算的商品对象集合信息
        List<Map<String, Object>> list = payService.selectShopItemsById(
                usersid, Arrays.toString(ck).replace("[", "").replace("]", ""));
        req.setAttribute("list", list);

        //获取当前用户的收获地址集合信息
        List<OrderRecipients> listOrder = orderRecipientsService.selectOrderRecipientsByUserId(usersid);
        req.setAttribute("listOrder", listOrder);
        return "cartindent";
    }
}
