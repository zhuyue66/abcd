package com.controller;

import com.bean.Favorites;
import com.bean.Goods;
import com.bean.Users;
import com.service.FavoritesService;
import com.service.GoodsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: zhuda
 * @Description:
 * @Date: Create in 16:39 2019/7/12
 */
@Controller
public class FavoritesController {

    @Resource(name="favoritesServiceImp")
    FavoritesService favoritesService;

    @Resource(name="goodsServiceImp")
    GoodsService goodsService;

    @RequestMapping("/is/addfavorites")
    public void addFavorites(HttpServletRequest req, int goodsid, HttpServletResponse response) throws Exception{

        System.out.println("进入收藏Controller  " + goodsid);

        Goods goods=goodsService.selectByPrimaryKey(goodsid);//根据这个商品id获取商品对象

        Favorites favorites=new Favorites();
        favorites.setItemGoods(goodsid);//设置加入收藏夹的商品id号
        favorites.setItemPrice(goods.getGoodsPrice()+0d);//设置加入收藏夹的商品价格

        Users users=(Users)req.getSession().getAttribute("nowuser");//获取当前登录对象
        favorites.setItemUser(users.getUserId());//设置加入收藏夹商品的用户id
        int r = favoritesService.insert(favorites);//调用service层保存收藏夹对象

        response.getWriter().print(r);
    }

}
