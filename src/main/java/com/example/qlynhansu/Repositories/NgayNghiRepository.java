package com.example.qlynhansu.Repositories;

import java.sql.Date;
import java.util.List;


import com.example.qlynhansu.Entities.NgayNghi;
import org.springframework.data.repository.CrudRepository;

public interface NgayNghiRepository {
	NgayNghi LayDanhSachNhanVien(Date ngaynghi);

	boolean ThemNgayNghi(NgayNghi ngaynghi);
	
	List<NgayNghi> LayNgayNghi(int thang);
	
	boolean XoaNgayNghi(int mann);

}
