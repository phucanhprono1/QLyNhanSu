package com.example.qlynhansu.DAO;

import java.util.List;

import com.example.qlynhansu.model.TrinhDoHocVan;
import com.example.qlynhansu.repository.TrinhDoHocVanRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class TrinhDoHocVanDAO implements TrinhDoHocVanRepository {
	
	@Autowired
	SessionFactory sessionFactory;

	@Transactional
	public List<TrinhDoHocVan> LayDSTrinhDoHV() {
		Session session = sessionFactory.getCurrentSession();
		try {
			List<TrinhDoHocVan> listTrinhDoHV = (List<TrinhDoHocVan>) session.createQuery("from TrinhDoHocVan").getResultList();
			return listTrinhDoHV;
		} catch (Exception e) {
			return null;
		}
		
	}

	@Transactional
	public boolean ThemHV(TrinhDoHocVan hocvan) {
		Session session = sessionFactory.getCurrentSession();
		try {	
			String mahv = (String) session.save(hocvan);
			if(mahv !=null) {
				return true;
			}else {
				return false;
			}
		}catch (Exception e) {
			System.out.println(e);
				return false;
	}
	}

	@Transactional
	public TrinhDoHocVan LayHocVan(String mahv) {
		Session session = sessionFactory.getCurrentSession();
		try {
			TrinhDoHocVan hocvan = (TrinhDoHocVan) session.createQuery("from TrinhDoHocVan where matdhv='"+mahv+"'").getSingleResult();
			return hocvan;
		} catch (Exception e) {
			return null;
		}
		
	}

	@Transactional
	public TrinhDoHocVan SuaHV(String mahv, String tenhv, String chuyennganh) {
		Session session = sessionFactory.getCurrentSession();
		try {
			TrinhDoHocVan hocvan = (TrinhDoHocVan) session.createQuery("from TrinhDoHocVan where matdhv='"+mahv+"'").getSingleResult();
			hocvan.setTentdhv(tenhv);
			hocvan.setChuyennganh(chuyennganh);
			session.update(hocvan);
			return hocvan;
		} catch (Exception e) {
			return null;
		}
	}

	@Transactional
	public TrinhDoHocVan XoaHV(String mahv) {
		Session session = sessionFactory.getCurrentSession();
		try {
			TrinhDoHocVan xoahv = session.get(TrinhDoHocVan.class, mahv);
			session.delete(xoahv);
			return xoahv;
		} catch (Exception e) {
			return null;
		}
	}
}
