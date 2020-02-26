package com.lijiajun.type.dao;

import java.util.List;

import com.lijiajun.type.entity.Goods;
import com.lijiajun.type.entity.GoodsBrand;
import com.lijiajun.type.entity.GoodsType;
import com.lijiajun.type.entity.TypeVO;

public interface TypeMapper {

	List<GoodsType> select(TypeVO vo);
	
	List<Goods> findBytype_id(Integer type_id);

	List<GoodsType> listType();

	List<GoodsBrand> listBrand();

	void add(GoodsType type);
}
