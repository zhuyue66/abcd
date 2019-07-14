package com.service;

import com.bean.OrderDetail;
import com.dao.OrderDetailMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: zhuda
 * @Description:
 * @Date: Create in 10:22 2019/7/13
 */
@Service
public class OrderDetailServiceImp implements OrderDetailService {

    @Resource(name = "orderDetailMapper")
    OrderDetailMapper orderDetailMapper;

    @Override
    public int deleteByPrimaryKey(int detailId) {
        // TODO Auto-generated method stub
        return orderDetailMapper.deleteByPrimaryKey(detailId);
    }

    @Override
    public List<OrderDetail> selectdetailId(String detailOrder) {
        return orderDetailMapper.selectdetailId(detailOrder);
    }


}
