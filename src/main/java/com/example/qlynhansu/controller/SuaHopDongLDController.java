package com.example.qlynhansu.controller;

import java.sql.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import com.example.qlynhansu.model.HopDongLaoDong;
import com.example.qlynhansu.model.NhanVien;
import com.example.qlynhansu.services.HopDongLDService;
import com.example.qlynhansu.services.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/suahd")
public class SuaHopDongLDController {
	
	@Autowired
	HopDongLDService hopdongldService;
	
	@Autowired
	NhanVienService nhanvienService;

	
	@GetMapping
	public String Default(HttpSession httpSession,String mahd,ModelMap modelMap) {
	try {
		List<NhanVien> listNhanVien = nhanvienService.LayDanhSachNhanVien();
		modelMap.addAttribute("listNhanVien",listNhanVien);
		
		mahd = (String) httpSession.getAttribute("showhd");
		HopDongLaoDong hopdong = hopdongldService.LayHD(mahd);
		modelMap.addAttribute("hopdong",hopdong);
	} catch (Exception e) {
		System.out.println("Suahdld:"+e.toString());
	}	
		
		
		return "suahd" ;
	}

	@PostMapping
	public String SuaHD(@RequestParam String mahd, @RequestParam String nhanvien,@RequestParam String loaihd, 
			@RequestParam int thoigian, @RequestParam Date tungay,@RequestParam Date denngay, ModelMap modelMap) {
	try {
		HopDongLaoDong hopdong = hopdongldService.SuaHD(mahd, nhanvien, loaihd, thoigian, tungay, denngay);
	} catch (Exception e) {
		System.out.println("Suahdld:"+e.toString());
	}
		
		
		return "redirect:/hopdongld";	
		
	}
}
