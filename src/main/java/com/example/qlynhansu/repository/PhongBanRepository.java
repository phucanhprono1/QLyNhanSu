package com.example.qlynhansu.repository;


import com.example.qlynhansu.model.PhongBan;

import java.util.List;

public interface PhongBanRepository {
	
	List<PhongBan> LayDanhSachPhongBan();
	
	boolean ThemPB(PhongBan phongban);
	
	PhongBan LayPB(String mapb);
	
	PhongBan SuaPB(String mapb, String tenpb, String sdtpb);
	
	PhongBan XoaPB(String mapb);

}
