package com.example.qlynhansu.services;

import java.sql.Date;
import java.util.List;

import com.example.qlynhansu.DAO.HopDongLDDAO;
import com.example.qlynhansu.model.HopDongLaoDong;
import com.example.qlynhansu.repository.HopDongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class HopDongLDService implements HopDongRepository {
	
	@Autowired
	HopDongLDDAO hopdongldDAO;

	public List<HopDongLaoDong> LayDanhSachHD() {
		
		return hopdongldDAO.LayDanhSachHD();
	}

	public boolean ThemHD(HopDongLaoDong hopdong)  {
		boolean kt = hopdongldDAO.ThemHD(hopdong);
		return kt;
	}

	public HopDongLaoDong LayHD(String mahd) {
		// TODO Auto-generated method stub
		return hopdongldDAO.LayHD(mahd);
	}

	public HopDongLaoDong SuaHD(String mahd, String nhanvien, String loaihd, int thoigian, Date tungay, Date denngay) {
		// TODO Auto-generated method stub
		return hopdongldDAO.SuaHD(mahd, nhanvien, loaihd, thoigian, tungay, denngay);
	}

	public HopDongLaoDong XoaHD(String mahd) {
		// TODO Auto-generated method stub
		return hopdongldDAO.XoaHD(mahd);
	}
}
