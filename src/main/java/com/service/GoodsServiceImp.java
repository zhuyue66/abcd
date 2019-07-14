package com.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.bean.Goods;
import com.dao.GoodsMapper;
import java.util.List;

@Service
public class GoodsServiceImp implements GoodsService {

	@Resource(name = "goodsMapper")
	GoodsMapper goodsMapper;// dao接口

	@Override
	public int deleteByPrimaryKey(Integer goodsId) {
		return 0;
	}

	@Override
	public int insert(Goods record) {
		return 0;
	}

	@Override
	public Goods selectByPrimaryKey(Integer goodsId) {
		return goodsMapper.selectByPrimaryKey(goodsId);
	}

	@Override
	public List<Goods> selectAll() {
		return goodsMapper.selectAll();
	}

	@Override
	public int updateByPrimaryKey(Goods record) {
		return 0;
	}

	@Override
	public List<Goods> selectGoodsByPage(int page) {
		int pageCount = 16;
		return goodsMapper.selectByPage((page-1)*pageCount, pageCount);
	}

	@Override
	public List<Goods> selectGoodsByName(String name) {
		List<Goods> list = goodsMapper.selectGoodsByName("%" + name + "%");
		return list;
	}
}
