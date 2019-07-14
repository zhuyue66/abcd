package com.dao;

import com.bean.Favorites;

/**
 * @Author: zhuda
 * @Description:
 * @Date: Create in 16:36 2019/7/12
 */
public interface FavoritesMapper {
    int deleteByPrimaryKey(Integer itemId);

    int insert(Favorites record);

    int insertSelective(Favorites record);

    Favorites selectByPrimaryKey(Integer itemId);

    int updateByPrimaryKeySelective(Favorites record);

    int updateByPrimaryKey(Favorites record);

    Favorites selectByItemGoods(int itemGoods);
}
