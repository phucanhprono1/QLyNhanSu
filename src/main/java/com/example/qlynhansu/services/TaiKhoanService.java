package com.example.qlynhansu.services;

import java.util.List;

import com.example.qlynhansu.DAO.TaiKhoanDAO;
import com.example.qlynhansu.model.TaiKhoan;
import com.example.qlynhansu.repository.TaiKhoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaiKhoanService implements TaiKhoanRepository {
	
	@Autowired
	TaiKhoanDAO taikhoanDAO;
	
	public List<TaiKhoan> LayDanhTaiKhoan() {
		
		return taikhoanDAO.LayDanhTaiKhoan();
	}

	public TaiKhoan XoaTaiKhoan( String tentaikhoan) {
		
		return taikhoanDAO.XoaTaiKhoan( tentaikhoan);
	}

	public TaiKhoan LayTaiKhoan(String tentaikhoan) {
		
		return taikhoanDAO.LayTaiKhoan(tentaikhoan);
	}

	public TaiKhoan SuaTaiKhoan(String tentaikhoan, String matkhau,String quyen) {
		
		return taikhoanDAO.SuaTaiKhoan(tentaikhoan, matkhau, quyen);
	}

	public boolean ThemTaiKhoan(TaiKhoan taikhoan) {
		boolean kiemtra = taikhoanDAO.ThemTaiKhoan(taikhoan);
		return kiemtra;
	}

	public TaiKhoan DoiMK(String tentaikhoan, String matkhau) {
		// TODO Auto-generated method stub
		return taikhoanDAO.DoiMK(tentaikhoan, matkhau);
	}

}
