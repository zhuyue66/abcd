package com.controller;

import com.bean.Users;
import com.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * @Author: zhuda
 * @Description:
 * @Date: Create in 14:40 2019/7/11
 */
@Controller
public class MemberAllOrderController {
    @Resource(name = "orderServiceImp")
    OrderService orderService;

    /**
     * 获取当前登陆用户的所有订单
     */
    @RequestMapping("/is/selectallorders")
    public String selectAllOrders(HttpServletRequest req) {
        // 1、获取当前登陆的用户id
        Users users = (Users) req.getSession().getAttribute("nowuser");
        int usersid = users.getUserId();// 获取当前登陆用户的id号
        System.out.println("MemberAllOrderController  获取当前登陆用户的id号" + usersid);
        List<Map<String, Object>> list = orderService.selectAllOrdersByUsersid(usersid);
        System.out.println(list + "===============");
        req.setAttribute("list", list);
        return "memberallorder";
    }
}
