package com.service;

import com.bean.OrderDetail;
import com.bean.Orders;
import com.bean.Shopitems;
import com.dao.OrderDetailMapper;
import com.dao.OrdersMapper;
import com.dao.ShopitemsMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * The type Order service imp.
 *
 * @Author: zhuda
 * @Description:
 * @Date: Create in 15:18 2019/7/10
 */
@Service
public class OrderServiceImp implements OrderService {

    /**
     * The Orders mapper.
     */
    @Resource(name = "ordersMapper")
    OrdersMapper ordersMapper;

    /**
     * The Order detail mapper.
     */
    @Resource(name = "orderDetailMapper")
    OrderDetailMapper orderDetailMapper;

    /**
     * The Shopitems mapper.
     */
    @Resource(name = "shopitemsMapper")
    ShopitemsMapper shopitemsMapper;

    @Override
    public int deleteByPrimaryKey(String orderId) {
        return 0;
    }



    /**
     *
     * 添加订单以及订单明细，并清空购物车
     *
     * */
    @Override
    public int insert(Orders record, List<OrderDetail> detailList,List<Shopitems> shopitemsList) {
        int r = ordersMapper.insert(record);
        //插入明细
        for (OrderDetail detail : detailList) {
            orderDetailMapper.insert(detail);
        }
        //删除购物车中的物品
        for (Shopitems shopitems : shopitemsList) {
            shopitemsMapper.deleteByPrimaryKey(shopitems.getItemId());
        }
        return r;
    }

    @Override
    public Orders selectByPrimaryKey(String orderId) {
        return null;
    }

    @Override
    public List<Orders> selectAll() {
        return null;
    }

    @Override
    public int updateByPrimaryKey(Orders record, List<OrderDetail> orderDetailList) {
        return 0;
    }

    @Override
    public int updateStatusById(Orders orders) {
        return ordersMapper.updateStatusById(orders);/*********** 修改为selected *********/
    }

    /**
     * 根据用户id获取所有的订单对象集合
     *
     * @param userid
     * @return
     */
    @Override
    public List<Map<String, Object>> selectAllOrdersByUsersid(int usersid) {
        return ordersMapper.selectAllOrdersByUsersid(usersid);
    }

    @Override
    public List<Map<String, Object>> selectWaitPayOrdersByUsersid(int usersid) {
        return ordersMapper.selectWaitPayOrdersByUsersid(usersid);
    }

    @Override
    public int deleteorderById(String orderId) {
        return ordersMapper.deleteByPrimaryKey(orderId);
    }
}
