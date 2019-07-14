package com.service;

import com.bean.OrderRecipients;
import com.dao.OrderRecipientsMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: zhuda
 * @Description:
 * @Date: Create in 8:49 2019/7/10
 */
@Service
public class OrderRecipientsServiceImp implements OrderRecipientsService {

    @Resource(name = "orderRecipientsMapper")
    OrderRecipientsMapper orderRecipientsMapper;

    @Override
    public List<OrderRecipients> selectOrderRecipientsByUserId(int userId) {
        return orderRecipientsMapper.selectOrderRecipientsByUserId(userId);
    }

    @Override
    public int insertSelective(OrderRecipients record) {
        return orderRecipientsMapper.insertSelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer recipientsId) {
        return 0;
    }

    @Override
    public int insert(OrderRecipients record) {
        return 0;
    }

    @Override
    public OrderRecipients selectByPrimaryKey(Integer recipientsId) {
        return orderRecipientsMapper.selectByPrimaryKey(recipientsId);
    }

    @Override
    public List<OrderRecipients> selectAll() {
        return null;
    }

    @Override
    public int updateByPrimaryKey(OrderRecipients record) {
        return 0;
    }
}
