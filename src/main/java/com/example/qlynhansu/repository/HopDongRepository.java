package com.example.qlynhansu.repository;

import java.sql.Date;
import java.util.List;

import com.example.qlynhansu.model.HopDongLaoDong;

public interface HopDongRepository {

	List<HopDongLaoDong> LayDanhSachHD();
	
	boolean ThemHD(HopDongLaoDong hopdong);
	
	HopDongLaoDong LayHD(String mahd);
	
	HopDongLaoDong SuaHD(String mahd, String nhanvien, String loaihd, int thoigian , Date tungay, Date denngay);
	
	HopDongLaoDong XoaHD(String mahd);
}
