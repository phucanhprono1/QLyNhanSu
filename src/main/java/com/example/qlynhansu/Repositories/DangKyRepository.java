package com.example.qlynhansu.Repositories;


import com.example.qlynhansu.Entities.TaiKhoan;
import org.springframework.data.repository.CrudRepository;

public interface DangKyRepository {
	
	boolean DangKy(TaiKhoan taikhoan);

}
