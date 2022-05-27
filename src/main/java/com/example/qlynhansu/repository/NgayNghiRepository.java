package com.example.qlynhansu.repository;

import java.sql.Date;
import java.util.List;


import com.example.qlynhansu.model.NgayNghi;

public interface NgayNghiRepository {
	NgayNghi LayDanhSachNhanVien(Date ngaynghi);

	boolean ThemNgayNghi(NgayNghi ngaynghi);
	
	List<NgayNghi> LayNgayNghi(int thang);
	
	boolean XoaNgayNghi(int mann);

}
