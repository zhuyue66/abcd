package com.controller;

/**
 * @Author: zhuda
 * @Description:
 * @Date: Create in 10:12 2019/7/13
 */

import com.bean.Users;
import com.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * 后台查询订单
 * @author Administrator
 *
 */
@Controller
public class WaitPayController {
    @Resource(name = "orderServiceImp")
    OrderService orderService;

    /**
     * 获取当前登录用户待付款的订单
     */
    @RequestMapping("/is/selectwaitpayorders")
    public String selectWaitPayOrders(HttpServletRequest req){
        // 1、获取当前登陆的用户id
        Users users = (Users) req.getSession().getAttribute("nowuser");
        int usersid = users.getUserId();// 获取当前登陆用户的id号
        List<Map<String, Object>> list = orderService.selectWaitPayOrdersByUsersid(usersid);
        System.out.println(list + "===============");
        Collections.reverse(list);
        req.setAttribute("list",list );
        return "waitingpay";
    }

}

