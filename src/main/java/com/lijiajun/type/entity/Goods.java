package com.lijiajun.type.entity;
/*
 * 创建商品表,get,set,toString,有参,无参
 * */
public class Goods {

	private Integer goods_id;
	
	private Integer type_id;
	
	private Integer brand_id;

	public Integer getGoods_id() {
		return goods_id;
	}

	public void setGoods_id(Integer goods_id) {
		this.goods_id = goods_id;
	}

	public Integer getType_id() {
		return type_id;
	}

	public void setType_id(Integer type_id) {
		this.type_id = type_id;
	}

	public Integer getBrand_id() {
		return brand_id;
	}

	public void setBrand_id(Integer brand_id) {
		this.brand_id = brand_id;
	}

	@Override
	public String toString() {
		return "Goods [goods_id=" + goods_id + ", type_id=" + type_id + ", brand_id=" + brand_id + "]";
	}

	public Goods(Integer goods_id, Integer type_id, Integer brand_id) {
		super();
		this.goods_id = goods_id;
		this.type_id = type_id;
		this.brand_id = brand_id;
	}

	public Goods() {
		super();
	}
}
