package com.example.qlynhansu.Repositories;

import java.sql.Date;
import java.util.List;

import com.example.qlynhansu.Entities.HopDongLaoDong;

import org.springframework.data.repository.CrudRepository;

public interface HopDongRepository extends CrudRepository<HopDongLaoDong,String> {

	List<HopDongLaoDong> LayDanhSachHD();
	
	boolean ThemHD(HopDongLaoDong hopdong);
	
	HopDongLaoDong LayHD(String mahd);
	
	HopDongLaoDong SuaHD(String mahd, String nhanvien, String loaihd, int thoigian , Date tungay, Date denngay);
	
	HopDongLaoDong XoaHD(String mahd);
}
