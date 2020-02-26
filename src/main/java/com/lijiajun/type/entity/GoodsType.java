package com.lijiajun.type.entity;
/*
 * 创建商品种类表和对应关系,get,set,toString,有参,无参
 * */

import java.util.List;

public class GoodsType {

	private Integer type_id;
	
	private String type_name;
	
	private String type_types;
	
	private Integer type_size;
	
	private double type_price;
	
	private Integer type_now;
	
	private String type_title;
	
	private String type_pic;
	
	private List<GoodsBrand> brands;

	public Integer getType_id() {
		return type_id;
	}

	public void setType_id(Integer type_id) {
		this.type_id = type_id;
	}

	public String getType_name() {
		return type_name;
	}

	public void setType_name(String type_name) {
		this.type_name = type_name;
	}

	public String getType_types() {
		return type_types;
	}

	public void setType_types(String type_types) {
		this.type_types = type_types;
	}

	public Integer getType_size() {
		return type_size;
	}

	public void setType_size(Integer type_size) {
		this.type_size = type_size;
	}

	public double getType_price() {
		return type_price;
	}

	public void setType_price(double type_price) {
		this.type_price = type_price;
	}

	public Integer getType_now() {
		return type_now;
	}

	public void setType_now(Integer type_now) {
		this.type_now = type_now;
	}

	public String getType_title() {
		return type_title;
	}

	public void setType_title(String type_title) {
		this.type_title = type_title;
	}

	public String getType_pic() {
		return type_pic;
	}

	public void setType_pic(String type_pic) {
		this.type_pic = type_pic;
	}

	public List<GoodsBrand> getBrands() {
		return brands;
	}

	public void setBrands(List<GoodsBrand> brands) {
		this.brands = brands;
	}

	@Override
	public String toString() {
		return "GoodsType [type_id=" + type_id + ", type_name=" + type_name + ", type_types=" + type_types
				+ ", type_size=" + type_size + ", type_price=" + type_price + ", type_now=" + type_now + ", type_title="
				+ type_title + ", type_pic=" + type_pic + ", brands=" + brands + "]";
	}

	public GoodsType(Integer type_id, String type_name, String type_types, Integer type_size, double type_price,
			Integer type_now, String type_title, String type_pic, List<GoodsBrand> brands) {
		super();
		this.type_id = type_id;
		this.type_name = type_name;
		this.type_types = type_types;
		this.type_size = type_size;
		this.type_price = type_price;
		this.type_now = type_now;
		this.type_title = type_title;
		this.type_pic = type_pic;
		this.brands = brands;
	}

	public GoodsType() {
		super();
	}
}
