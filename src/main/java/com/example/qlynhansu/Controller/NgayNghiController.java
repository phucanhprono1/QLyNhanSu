package com.example.qlynhansu.Controller;

import java.sql.Date;
import java.util.List;

import com.example.qlynhansu.Entities.NhanVien;
import com.example.qlynhansu.Services.NgayNghiService;
import com.example.qlynhansu.Services.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/ngaynghi")
public class NgayNghiController {
	@Autowired
	NgayNghiService ngaynghiService;
	@Autowired
	NhanVienService nhanvienService;

	@GetMapping
	public String Default(ModelMap modelMap) {
		Date today = new Date(System.currentTimeMillis());
		modelMap.addAttribute("ngaynghi", today);
	try {
		List<NhanVien> listNhanVien = nhanvienService.LayDanhSachNhanVien();
		modelMap.addAttribute("listNhanVien", listNhanVien);
	} catch (Exception e) {
		System.out.println("NgayNghiController:"+e.toString());
	}	
		
		return "ngaynghi";
	}

}
