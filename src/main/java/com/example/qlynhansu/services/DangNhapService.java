package com.example.qlynhansu.services;

import com.example.qlynhansu.DAO.DangNhapDAO;
import com.example.qlynhansu.model.TaiKhoan;
import com.example.qlynhansu.repository.DangNhapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DangNhapService implements DangNhapRepository {
	
	@Autowired
	DangNhapDAO dangnhapDAO;
	
	public boolean DangNhap(String tentaikhoan, String matkhau) {
		
		boolean kiemtra = dangnhapDAO.DangNhap(tentaikhoan, matkhau);
		return kiemtra;
	}

	public TaiKhoan LayTaiKhoan(String tentaikhoan, String matkhau) {
		// TODO Auto-generated method stub
		return dangnhapDAO.LayTaiKhoan(tentaikhoan, matkhau);
	}
}
