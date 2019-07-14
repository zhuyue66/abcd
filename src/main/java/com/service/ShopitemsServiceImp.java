package com.service;

import com.bean.Shopitems;
import com.dao.ShopitemsMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * The type Shopitems service imp.
 *
 * @Author: zhuda
 * @Description:
 * @Date: Create in 16:34 2019/7/7
 */
@Service
public class ShopitemsServiceImp implements ShopitemsService {

    /**
     * The Shopitems mapper.
     */
    @Resource(name = "shopitemsMapper")
    ShopitemsMapper shopitemsMapper;

    @Override
    public int deleteByPrimaryKey(Integer itemId) {
        return shopitemsMapper.deleteByPrimaryKey(itemId);
    }

    /***
     * 加入一个购物车商品
     *
     * @param record
     * @return
     */
    @Override
    public int insert(Shopitems record) {
        // 1、根据加入购物车商品的id号，去判断当前用户的购物车里面是不是这个商品,如果有，增加，否则，修改这个商品的数量
        Shopitems sp = shopitemsMapper.selectByGoodsIdandUsersId(record);
        if (sp == null) {// 当前用户的购物车里面没有这个商品
            return shopitemsMapper.insert(record);// 调用dao层增加一个商品到购物车里面
        } else {// 当前用户的购物车里面有这个商品,修改数量
            sp.setItemNum(sp.getItemNum() + 1);
            return shopitemsMapper.updateByPrimaryKey(sp);
        }

    }
    @Override
    public Shopitems selectByPrimaryKey(Integer itemId) {
        return null;
    }

    @Override
    public List<Shopitems> selectAll() {
        return null;
    }


    /**
     * 根据主键id修改数量
     */
    @Override
    public int updateNumByPrimaryKey(Shopitems record) {
        return shopitemsMapper.updateByPrimaryKeySelective(record);
    }

    /**
     * 查询当前登陆用户的购物车集合对象信息
     *
     * @param usersid
     *            用户的id
     */
    @Override
    public List<Map<String, Object>> selectShopitemsByUsersId(int usersid) {
        return shopitemsMapper.selectShopitemsByUsersId(usersid);
    }

    @Override
    public int updateByPrimaryKey(Shopitems record) {
        return 0;
    }

    @Override
    public List<Shopitems> selectByArrid(String ids, int i) {
        return shopitemsMapper.selectByArrid(ids,0);
    }
}
