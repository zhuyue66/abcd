package com.controller;

import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import com.redisdao.MyRedisTempDao;
import com.service.GoodsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.bean.Goods;

@Controller
public class GoodsController {

	// 注入接口的实现类对象
	@Resource(name = "goodsServiceImp")
	GoodsService goodsService;// service

	@Resource(name = "myRedisTempDaoImp")
	MyRedisTempDao myRedisTempDao;

	/**
	 * 首页显示Goods
	 * @return 返回视图***.jsp
	 */
	@RequestMapping("/showgoodslist")
	public String showGoodsListByPage(int page, HttpServletRequest req) {
		page = (page == 0) ? 1 : page;
		List<Goods> list = goodsService.selectGoodsByPage(page);
		req.setAttribute("list", list);
		req.setAttribute("page", page);//设置上一页下一页
		return "showgoodslist";
	}

	@RequestMapping("/redistest")
	public String redisTest(String key) {
		myRedisTempDao.setValue("a", "zhuda", 20);
		System.out.println( "测试redis缓存中的数据" + myRedisTempDao.getValue("a"));
		return "";
	}

	@RequestMapping("/selectgoodsbyname")
	public String selectGoodsByName(String name, HttpServletRequest request) {
		System.out.println("搜索输入框的名称" + name);
		List<Goods> list = goodsService.selectGoodsByName(name);
		request.setAttribute("list",list);
		return "showgoodslist";
	}
}
