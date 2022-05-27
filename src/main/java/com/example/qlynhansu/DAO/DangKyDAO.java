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
public class DangKyDAO implements DangKyRepository {
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	public boolean DangKy(TaiKhoan taikhoan) {
		Session session = sessionFactory.getCurrentSession();

		String tentaikhoan = (String) session.save(taikhoan);
		if(tentaikhoan !=null) {
			return true;
		}else {
			return false;
		}
	
	
		
	}

}
