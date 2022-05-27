package com.example.qlynhansu.DAO;

import java.util.List;

import com.example.qlynhansu.model.BangLuong;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;
import com.example.qlynhansu.repository.BangLuongRepository;

@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class BangLuongDAO implements BangLuongRepository {
	
	@Autowired
	SessionFactory sessionFactory;

	public List<BangLuong> LayDanhLuong() {
		Session session = sessionFactory.getCurrentSession();
		try {
			
			List<BangLuong> listBangLuong = (List<BangLuong>) session.createQuery("from BangLuong").getResultList();
			return listBangLuong;
			
		} catch (Exception e) {
			return null;
		}
	}

}
