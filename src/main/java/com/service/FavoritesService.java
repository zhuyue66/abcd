package com.service;

import com.bean.Favorites;

/**
 * @Author: zhuda
 * @Description:
 * @Date: Create in 16:32 2019/7/12
 */
public interface FavoritesService {

    int deleteByPrimaryKey(Integer itemId);

    int insert(Favorites record);

    int insertSelective(Favorites record);

    Favorites selectByPrimaryKey(Integer itemId);

    int updateByPrimaryKeySelective(Favorites record);

    int updateByPrimaryKey(Favorites record);

    Favorites selectByItemGoods(int itemGoods);


}
