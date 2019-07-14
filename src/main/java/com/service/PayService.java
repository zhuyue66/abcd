package com.service;

import java.util.List;
import java.util.Map;

/**
 * @Author: zhuda
 * @Description:
 * @Date: Create in 16:19 2019/7/9
 */
public interface PayService {
    /**
     * 根据用户id及购物车id数组，获取购物车集合对象
     *
     * @param sid
     * @return
     */
    List<Map<String, Object>> selectShopItemsById(int usersid, String sid);

}
