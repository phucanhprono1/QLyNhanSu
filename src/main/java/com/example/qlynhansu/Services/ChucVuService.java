package com.example.qlynhansu.Services;

import java.util.List;
import java.util.Optional;

import com.example.qlynhansu.DAO.ChucVuDAO;
import com.example.qlynhansu.Entities.ChucVu;
import com.example.qlynhansu.Repositories.ChucVuResporitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChucVuService implements ChucVuResporitory {
	
	@Autowired
	ChucVuDAO chucvuDAO;

	public List<ChucVu> LayDanhChucVu() {
		
		return chucvuDAO.LayDanhChucVu();
	}

	public boolean ThemCV(ChucVu chucvu) {
		boolean kiemtra = chucvuDAO.ThemCV(chucvu);
		return kiemtra;
	}

	public ChucVu LayCV(String macv) {
		
		return chucvuDAO.LayCV(macv);
	}

	public ChucVu SuaCV(String macv, String tencv, String mota) {
		
		return chucvuDAO.SuaCV(macv, tencv, mota);
	}

	public ChucVu XoaCV(String macv) {
		
		return chucvuDAO.XoaCV(macv);
	}
}
