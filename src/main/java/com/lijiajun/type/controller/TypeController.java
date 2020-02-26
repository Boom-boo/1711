package com.lijiajun.type.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lijiajun.type.entity.GoodsBrand;
import com.lijiajun.type.entity.GoodsType;
import com.lijiajun.type.entity.TypeVO;
import com.lijiajun.type.service.TypeService;

@Controller
public class TypeController {

	@Autowired
	private TypeService service;
	
	@RequestMapping("select")
	public String select(TypeVO vo,Model m){
		//判断是否是第一次进入页面
		if(vo.getPageNum()==null){
			vo.setPageNum(1);
		}
		//分页公式
		PageHelper.startPage(vo.getPageNum(),3);
		
		List<GoodsType> list=service.select(vo);
		
		PageInfo<GoodsType> page=new PageInfo<GoodsType>(list);
		//商品种类表
		List<GoodsType> type=service.listType();
		//商品品牌
		List<GoodsBrand> brand=service.listBrand();
		
		m.addAttribute("type",type);
		m.addAttribute("brand",brand);
		m.addAttribute("page", page);
		m.addAttribute("vo",vo);
		
		return "select";
	}
	
	@RequestMapping("add.do")
	public String add(Model m,@Validated @ModelAttribute GoodsType type,MultipartFile myfile,HttpServletRequest request){
		
		service.add(type);
		
		return "redirect:select";
	}
}
