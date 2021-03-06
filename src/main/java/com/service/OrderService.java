package com.service;

import com.bean.OrderDetail;
import com.bean.Orders;
import com.bean.Shopitems;

import java.util.List;
import java.util.Map;

/**
 * @Author: zhuda
 * @Description:
 * @Date: Create in 15:18 2019/7/10
 */
public interface OrderService {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String orderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated
     */
    int insert(Orders record, List<OrderDetail> detailList,List<Shopitems> shopitemsList);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated
     */
    Orders selectByPrimaryKey(String orderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated
     */
    List<Orders> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Orders record, List<OrderDetail> orderDetailList);

    int updateStatusById(Orders orders);

    List<Map<String, Object>> selectAllOrdersByUsersid(int usersid);

    List<Map<String, Object>> selectWaitPayOrdersByUsersid(int usersid);

    int deleteorderById(String uuid);
}
