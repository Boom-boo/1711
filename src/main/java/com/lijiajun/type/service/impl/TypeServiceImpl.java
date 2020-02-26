package com.lijiajun.type.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lijiajun.type.dao.TypeMapper;
import com.lijiajun.type.entity.GoodsBrand;
import com.lijiajun.type.entity.GoodsType;
import com.lijiajun.type.entity.TypeVO;
import com.lijiajun.type.service.TypeService;
@Service
public class TypeServiceImpl implements TypeService {

	@Autowired
	private TypeMapper dao;

	@Override
	public List<GoodsType> select(TypeVO vo) {
		
		return dao.select(vo);
	}

	@Override
	public List<GoodsType> listType() {
		
		return dao.listType();
	}

	@Override
	public List<GoodsBrand> listBrand() {
		
		return dao.listBrand();
	}

	@Override
	public void add(GoodsType type) {
		
		dao.add(type);
	}

}
