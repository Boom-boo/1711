package com.lijiajun.type.entity;

public class TypeVO{

	private String type_types;
	
	private String brand_name;
	
	private double p1;
	
	private double p2;
	
	private String type_name;
	
	private Integer pageNum;

	private String brand_english;
	
	private String type_title;

	public String getType_types() {
		return type_types;
	}

	public void setType_types(String type_types) {
		this.type_types = type_types;
	}

	public String getBrand_name() {
		return brand_name;
	}

	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}

	public double getP1() {
		return p1;
	}

	public void setP1(double p1) {
		this.p1 = p1;
	}

	public double getP2() {
		return p2;
	}

	public void setP2(double p2) {
		this.p2 = p2;
	}

	public String getType_name() {
		return type_name;
	}

	public void setType_name(String type_name) {
		this.type_name = type_name;
	}

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public String getBrand_english() {
		return brand_english;
	}

	public void setBrand_english(String brand_english) {
		this.brand_english = brand_english;
	}

	public String getType_title() {
		return type_title;
	}

	public void setType_title(String type_title) {
		this.type_title = type_title;
	}

	@Override
	public String toString() {
		return "TypeVO [type_types=" + type_types + ", brand_name=" + brand_name + ", p1=" + p1 + ", p2=" + p2
				+ ", type_name=" + type_name + ", pageNum=" + pageNum + ", brand_english=" + brand_english
				+ ", type_title=" + type_title + "]";
	}

	public TypeVO(String type_types, String brand_name, double p1, double p2, String type_name, Integer pageNum,
			String brand_english, String type_title) {
		super();
		this.type_types = type_types;
		this.brand_name = brand_name;
		this.p1 = p1;
		this.p2 = p2;
		this.type_name = type_name;
		this.pageNum = pageNum;
		this.brand_english = brand_english;
		this.type_title = type_title;
	}

	public TypeVO() {
		super();
	}
}
