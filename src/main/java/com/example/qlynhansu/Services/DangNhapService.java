package com.example.qlynhansu.Services;

import com.example.qlynhansu.DAO.DangNhapDAO;
import com.example.qlynhansu.Entities.TaiKhoan;
import com.example.qlynhansu.Repositories.DangNhapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

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
