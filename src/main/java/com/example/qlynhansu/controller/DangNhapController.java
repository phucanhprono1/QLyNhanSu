package com.example.qlynhansu.controller;

import com.example.qlynhansu.model.TaiKhoan;
import com.example.qlynhansu.services.DangNhapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/dangnhap")
@SessionAttributes("user")
public class DangNhapController {
	
	@GetMapping
	public String Default() {
		return "dangnhap" ;
	}
	
	
	@Autowired
	DangNhapService dangnhapService;
	
	@PostMapping
	@Transactional
	public String DangNhap(@RequestParam String tentaikhoan,@RequestParam String matkhau, ModelMap modelMap, HttpServletRequest req) {
		
	try {
		HttpSession session = req.getSession();
		TaiKhoan tk = dangnhapService.LayTaiKhoan(tentaikhoan, matkhau);
		boolean kiemtra =dangnhapService.DangNhap(tentaikhoan,matkhau);
		if (kiemtra) {
			session.setAttribute("quyen",tk.getQuyen());
			modelMap.addAttribute("user",tentaikhoan);
			return "redirect:/";
		}else {
			modelMap.addAttribute("kiemtra","Đăng Nhập Thất Bại!");
			return "dangnhap";		
		}
	} catch (Exception e) {
			modelMap.addAttribute("kiemtra","Đăng Nhập Thất Bại!");
			return "dangnhap";		
	}
		
		
	}
	
  
}