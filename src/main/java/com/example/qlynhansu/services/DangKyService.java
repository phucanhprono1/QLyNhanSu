package com.example.qlynhansu.services;

import com.example.qlynhansu.DAO.DangKyDAO;
import com.example.qlynhansu.model.TaiKhoan;
import com.example.qlynhansu.repository.DangKyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DangKyService implements DangKyRepository {
	@Autowired
	DangKyDAO dangkyDAO;
	
	public boolean DangKy(TaiKhoan taikhoan) {
		boolean kiemtra = dangkyDAO.DangKy(taikhoan); 
		return kiemtra;
	}
}
