package com.example.qlynhansu.controller;

import javax.servlet.http.HttpSession;

import com.example.qlynhansu.model.TrinhDoHocVan;
import com.example.qlynhansu.services.TrinhDoHocVanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/suahv")
public class SuaHVController {
	
	@Autowired
	TrinhDoHocVanService trinhdohocvanService;
	
	@GetMapping
	public String Default(HttpSession httpSession,String mahv,ModelMap modelMap) {
	
		try {
			mahv = (String) httpSession.getAttribute("showhv");
			TrinhDoHocVan hocvan = trinhdohocvanService.LayHocVan(mahv);
			modelMap.addAttribute("hocvan",hocvan);
		} catch (Exception e) {
			System.out.println("TrinhDoHVController:"+e.toString());
		}
		
		
		return "suahv" ;
	}

	@PostMapping
	public String SuaHV(@RequestParam String mahv, @RequestParam String tenhv,@RequestParam String chuyennganh, ModelMap modelMap) {

		try {
			TrinhDoHocVan hocvan = trinhdohocvanService.SuaHV(mahv, tenhv, chuyennganh);
			
		} catch (Exception e) {
			System.out.println("TrinhDoHVController:"+e.toString());
		}
		
		
		return "redirect:/trinhdohv";	
		
	}

}
