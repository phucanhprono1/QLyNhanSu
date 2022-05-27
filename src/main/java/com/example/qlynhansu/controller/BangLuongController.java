package com.example.qlynhansu.controller;

import java.sql.Date;
import java.util.List;

import com.example.qlynhansu.model.NgayNghi;
import com.example.qlynhansu.model.NhanVien;
import com.example.qlynhansu.services.NgayNghiService;
import com.example.qlynhansu.services.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/bangluong")
public class BangLuongController {
	@Autowired
	NhanVienService nhanvienService;
	@Autowired
	NgayNghiService ngaynghiService;

	@GetMapping
	public String Default(ModelMap modelMap) {
		Date aDate = new Date(System.currentTimeMillis());
		NgayNghi nn = new NgayNghi();
		try {
			List<NhanVien> listNhanVien = nhanvienService.LayDanhSachNhanVien();
			modelMap.addAttribute("listNhanVien", listNhanVien);
			modelMap.addAttribute("adate", aDate);
			modelMap.addAttribute("ngaynghi", nn);
			
		} catch (Exception ex) {
			System.out.println("error bangluongController " + ex.toString());
			modelMap.addAttribute("err", ex);
			return "bangluong";
		}

		return "bangluong";
	}
}
