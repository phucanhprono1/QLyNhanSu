package com.example.qlynhansu.Services;

import com.example.qlynhansu.DAO.DangKyDAO;
import com.example.qlynhansu.Entities.TaiKhoan;
import com.example.qlynhansu.Repositories.DangKyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class DangKyService implements DangKyRepository {
	@Autowired
	DangKyDAO dangkyDAO;
	
	public boolean DangKy(TaiKhoan taikhoan) {
		boolean kiemtra = dangkyDAO.DangKy(taikhoan); 
		return kiemtra;
	}
}
