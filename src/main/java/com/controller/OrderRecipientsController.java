package com.controller;

import com.bean.OrderRecipients;
import com.bean.Users;
import com.service.OrderRecipientsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: zhuda
 * @Description:
 * @Date: Create in 10:16 2019/7/10
 */
@Controller
public class OrderRecipientsController {


    @Resource(name = "orderRecipientsServiceImp")
    OrderRecipientsService orderRecipientsService;

    /***
     * 增加一个地址对象，根据当前用户ID
     */
    @RequestMapping("/is/addorderrecipients")
    public void addOrderRecipients(HttpServletRequest request, OrderRecipients orderRecipients,
                                   HttpServletResponse response){

        // 1、获取购物车里面提交选中的购物车对象的id号 、ck是选择购物车的id号数组
        int usersid = ((Users) request.getSession().getAttribute("nowuser"))
                .getUserId();//当前用户的id

        orderRecipients.setRecipientsUser(usersid);
        orderRecipients.setRecipientsChecked(0);//默认不选中

        System.out.println("要添加的收货人信息：" + orderRecipients.toString());

        int r = orderRecipientsService.insertSelective(orderRecipients);

        try {
            response.getWriter().print(r);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
