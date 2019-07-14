package com.service;

import com.bean.OrderDetail;

import java.util.List;

/**
 * @Author: zhuda
 * @Description:
 * @Date: Create in 10:21 2019/7/13
 */
public interface OrderDetailService {


    int deleteByPrimaryKey(int detailId);

    List<OrderDetail> selectdetailId(String detailOrder);

}
