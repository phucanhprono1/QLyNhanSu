package com.example.qlynhansu.Repositories;

import com.example.qlynhansu.Entities.TaiKhoan;
import org.springframework.data.repository.CrudRepository;

public interface DangNhapRepository extends CrudRepository<TaiKhoan,String> {

    boolean DangNhap(String tentaikhoan, String matkhau);
    TaiKhoan LayTaiKhoan(String tentaikhoan, String matkhau);

}