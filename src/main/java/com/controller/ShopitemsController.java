package com.controller;

import com.bean.Goods;
import com.bean.Shopitems;
import com.bean.Users;
import com.service.GoodsService;
import com.service.ShopitemsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * @Author: zhuda
 * @Description:
 * @Date: Create in 16:36 2019/7/7
 */
@Controller
public class ShopitemsController {

    @Resource(name = "shopitemsServiceImp")
    ShopitemsService shopitemsService;

    @Resource(name = "goodsServiceImp")
    GoodsService goodsSercie;


    /***
     * 加入购物车
     *
     * @param req
     * @param goodsid
     * @return
     */
    @RequestMapping("/is/addshopitems")
    public String addShopitems(HttpServletRequest req, int goodsid) {
        // goodsid 商品的id号

        System.out.println("ShopitemsController 添加购物车 物品ID是  " + goodsid);

        Goods goods = goodsSercie.selectByPrimaryKey(goodsid);// 根据商品的id号获取这个商品对象，获取价格

        System.out.println("ShopitemsController 添加购物车 物品是  " + goods.toString());

        Shopitems shopitems = new Shopitems();// 创建一个购物车对象
        shopitems.setItemGoods(goodsid);// 设置加入购物车的商品id号
        shopitems.setItemNum(1);// 设置加入购物车的商品数量

        System.out.println("添加购物车  " + shopitems.toString());

        shopitems.setItemPrice(goods.getGoodsPrice() + 0d);// 设置加入购物车商品的价格
        // (+0d是把float转换为double类型)

        Users users = (Users) req.getSession().getAttribute("nowuser");// 获取当前登陆的用户对象
        shopitems.setItemUser(users.getUserId());// 设置加入购物车商品的用户id，实际就是这个商品是属于那个用户的

        System.out.println("ShopitemsController 添加到购物车的物品信息" + shopitems.toString());
        shopitemsService.insert(shopitems);// 调用service层保存购物车对象

        return "redirect:/addshopitemssuccess.jsp";
    }

    /**
     * 查询当前登陆用户的购物车信息
     *
     * @return
     */
    @RequestMapping("/is/selectshopitems")
    public String selectShopitems(HttpServletRequest req) {
        // 1、获取当前登陆的用户id
        Users users = (Users) req.getSession().getAttribute("nowuser");
        int usersid = users.getUserId();// 获取当前登陆用户的id号
        // ///////////////
        List<Map<String, Object>> list = shopitemsService.selectShopitemsByUsersId(usersid);
        req.setAttribute("list", list);
        return "selectshopitems";
    }

    /**
     *
     * 删除购物车货物
     *
     * */
    @RequestMapping("/is/deleteshopitemsbyid")
    public void deleteShopitemsById(int spid, HttpServletResponse response) {
        int a  = shopitemsService.deleteByPrimaryKey(spid);
        try {
            response.getWriter().print(a);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 根据购物车的id删改购物车的数量
     * @param res
     * @param shopitems
     *
     * car.js 66 行
     *
     */
    @RequestMapping("/is/upshopitemsnumbyid")
    public void upShopitemsNumById(HttpServletResponse res,Shopitems shopitems){
        System.out.println("修改购物车物品数量" + shopitems.toString());
        shopitemsService.updateNumByPrimaryKey(shopitems);
    }

    /**
     * 获取当前登陆用户的购物车商品的数量
     *
     * @throws IOException
     */
    @RequestMapping("/is/getshopitemscount")
    public void getShopitemsCount(HttpServletRequest req, HttpServletResponse res) throws IOException {
        // 1、获取当前登陆的用户id
        Users users = (Users) req.getSession().getAttribute("nowuser");
        int usersid = users.getUserId();// 获取当前登陆用户的id号
        // 获取用户的购物车集合对象
        List<Map<String, Object>> list = shopitemsService.selectShopitemsByUsersId(usersid);
        int sum = 0;
        for (Map<String, Object> stringObjectMap : list) {
            sum += (int)stringObjectMap.get("item_num");
        }
        System.out.println("111111111111"+sum);
        res.getWriter().print(list.size());
    }
}