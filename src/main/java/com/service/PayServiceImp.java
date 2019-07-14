package com.service;

import com.dao.ShopitemsMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @Author: zhuda
 * @Description:
 * @Date: Create in 16:19 2019/7/9
 */
@Service
public class PayServiceImp implements PayService {
    @Resource(name = "shopitemsMapper")
    ShopitemsMapper shopitemsMapper;

    /**
     * 根据用户id及购物车id数组，获取购物车集合对象
     *
     * @param sid
     * @return
     */
    @Override
    public List<Map<String, Object>> selectShopItemsById(int usersid, String sid) {
        return shopitemsMapper.selectShopitemsById(usersid, sid);
    }
}
