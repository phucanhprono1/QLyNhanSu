package com.example.qlynhansu.Repositories;

import java.util.List;

import com.example.qlynhansu.Entities.TaiKhoan;
import org.springframework.data.repository.CrudRepository;

public interface TaiKhoanRepository {
	
	List<TaiKhoan> LayDanhTaiKhoan();
	
	TaiKhoan XoaTaiKhoan( String tentaikhoan);
	
	TaiKhoan LayTaiKhoan(String tentaikhoan );
	
	TaiKhoan SuaTaiKhoan(String tentaikhoan, String matkhau ,String quyen);
	
	TaiKhoan DoiMK(String tentaikhoan, String matkhau);
	
	boolean ThemTaiKhoan(TaiKhoan taikhoan);
}
