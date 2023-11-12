package com.fit.se.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fit.se.entity.GiangVien;
import com.fit.se.service.GiangVienService;

@Controller
public class TestController {
	@Autowired
	private GiangVienService giangVienService;
	
	@RequestMapping("")
	public String test() {
		giangVienService.save(new GiangVien(1, "Test1", "Test1", "test1", "test1"));
//		giangVienService.getAll().forEach((item)->{
//			System.out.println(item.toString());
//		});
		
		return "test";
	}
}
