package com.example.qlynhansu.services;

import java.util.List;

import com.example.qlynhansu.DAO.PhongBanDAO;
import com.example.qlynhansu.model.PhongBan;
import com.example.qlynhansu.repository.PhongBanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class PhongBanService implements PhongBanRepository {
	
	@Autowired
	PhongBanDAO phongbanDAO;

	public List<PhongBan> LayDanhSachPhongBan() {
		
		return phongbanDAO.LayDanhSachPhongBan();
	}

	public boolean ThemPB(PhongBan phongban) {
		boolean kiemtra = phongbanDAO.ThemPB(phongban);
		
		return kiemtra;
	}

	public PhongBan LayPB(String mapb) {
		
		return phongbanDAO.LayPB(mapb);
	}

	public PhongBan SuaPB(String mapb, String tenpb, String sdtpb) {
		
		return phongbanDAO.SuaPB(mapb, tenpb, sdtpb);
	}

	public PhongBan XoaPB(String mapb) {
		
		return phongbanDAO.XoaPB(mapb);
	}
}
