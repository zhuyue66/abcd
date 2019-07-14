package com.service;

import com.bean.Favorites;
import com.dao.FavoritesMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: zhuda
 * @Description:
 * @Date: Create in 16:37 2019/7/12
 */
@Service
public class FavoritesServiceImp implements FavoritesService {

    @Resource(name="favoritesMapper")
    FavoritesMapper favoritesMapper;


    @Override
    public int deleteByPrimaryKey(Integer itemId) {
        return 0;
    }

    @Override
    public int insert(Favorites record) {
        Favorites favorites = favoritesMapper.selectByItemGoods(record.getItemGoods());

        if (favorites != null) {
            System.out.println("重复");
            return -1;
        }else{
            return favoritesMapper.insert(record);
        }
    }

    @Override
    public int insertSelective(Favorites record) {
        return 0;
    }

    @Override
    public Favorites selectByPrimaryKey(Integer itemId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Favorites record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Favorites record) {
        return 0;
    }

    @Override
    public Favorites selectByItemGoods(int itemGoods) {
        return favoritesMapper.selectByItemGoods(itemGoods);
    }
}
