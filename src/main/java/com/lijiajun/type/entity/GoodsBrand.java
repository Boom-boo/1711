package com.lijiajun.type.entity;
/*
 * 创建商品品牌表,get,set,toString,有参,无参
 * */
public class GoodsBrand {
	
	private Integer brand_id;
	
	private String brand_english;
	
	private String brand_name;

	public Integer getBrand_id() {
		return brand_id;
	}

	public void setBrand_id(Integer brand_id) {
		this.brand_id = brand_id;
	}

	public String getBrand_english() {
		return brand_english;
	}

	public void setBrand_english(String brand_english) {
		this.brand_english = brand_english;
	}

	public String getBrand_name() {
		return brand_name;
	}

	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}

	@Override
	public String toString() {
		return "GoodsBrand [brand_id=" + brand_id + ", brand_english=" + brand_english + ", brand_name=" + brand_name
				+ "]";
	}

	public GoodsBrand(Integer brand_id, String brand_english, String brand_name) {
		super();
		this.brand_id = brand_id;
		this.brand_english = brand_english;
		this.brand_name = brand_name;
	}

	public GoodsBrand() {
		super();
	}
}
