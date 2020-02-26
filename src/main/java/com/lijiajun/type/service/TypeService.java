package com.lijiajun.type.service;

import java.util.List;

import com.lijiajun.type.entity.GoodsBrand;
import com.lijiajun.type.entity.GoodsType;
import com.lijiajun.type.entity.TypeVO;

public interface TypeService {

	List<GoodsType> select(TypeVO vo);

	List<GoodsType> listType();

	List<GoodsBrand> listBrand();

	void add(GoodsType type);

}
