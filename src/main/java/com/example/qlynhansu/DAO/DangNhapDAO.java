package com.example.qlynhansu.DAO;

import com.example.qlynhansu.model.TaiKhoan;
import com.example.qlynhansu.repository.DangKyRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;



@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class DangNhapDAO implements DangKyRepository {
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	public boolean DangNhap(String tentaikhoan, String matkhau) {
		Session session = sessionFactory.getCurrentSession();
		try {
			TaiKhoan taikhoan  =(TaiKhoan) session.createQuery("from TaiKhoan where TenTaiKhoan='"+tentaikhoan+"' and MatKhau='"+matkhau+"'").getSingleResult();
			if(taikhoan != null) {
				return true;
			}else {
				return false;
			}
		} catch (Exception e) {
				return false;
		}
		
	}

	@Transactional
	public TaiKhoan LayTaiKhoan(String tentaikhoan, String matkhau) {
		try {
			Session session = sessionFactory.getCurrentSession();
			TaiKhoan taikhoan  =(TaiKhoan) session.createQuery("from TaiKhoan where username ='"+tentaikhoan+"' and password ='"+matkhau+"'").getSingleResult();
			return taikhoan;
		} catch (Exception e) {
			return null;
		}
		
	}


	@Override
	public boolean DangKy(TaiKhoan taikhoan) {
		return false;
	}
}
