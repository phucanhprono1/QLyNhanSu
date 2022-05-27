package com.example.qlynhansu.repository;

import com.example.qlynhansu.model.TaiKhoan;

public interface DangNhapRepository {

    boolean DangNhap(String tentaikhoan, String matkhau);
    TaiKhoan LayTaiKhoan(String tentaikhoan, String matkhau);

}