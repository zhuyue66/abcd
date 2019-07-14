package com.controller;

import com.bean.Orders;
import com.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * The type Cart success.
 *
 * @Author: zhuda
 * @Description:
 * @Date: Create in 14:14 2019/7/11
 */
@Controller
public class CartSuccess {

    @Resource(name = "orderServiceImp")
    OrderService orderService;

    /**
     * Cart pay success.
     *
     * @param uuid 订单编号
     */
    @RequestMapping("/is/cartpay")
    public String cartPaySuccess(String uuid){

        //先支付成功

        Orders orders = new Orders();
        orders.setOrderId(uuid);
        orders.setOrderStatus(3);
        orderService.updateStatusById(orders);
        return "cartsuccess";
    }
}
