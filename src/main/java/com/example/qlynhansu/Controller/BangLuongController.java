package com.example.qlynhansu.Controller;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.List;

import com.example.qlynhansu.Entities.NgayNghi;
import com.example.qlynhansu.Entities.NhanVien;
import com.example.qlynhansu.Services.NgayNghiService;
import com.example.qlynhansu.Services.NhanVienService;
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
