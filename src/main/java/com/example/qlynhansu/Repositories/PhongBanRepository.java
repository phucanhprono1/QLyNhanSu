package com.example.qlynhansu.Repositories;


import com.example.qlynhansu.Entities.PhongBan;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PhongBanRepository {
	
	List<PhongBan> LayDanhSachPhongBan();
	
	boolean ThemPB(PhongBan phongban);
	
	PhongBan LayPB(String mapb);
	
	PhongBan SuaPB(String mapb, String tenpb, String sdtpb);
	
	PhongBan XoaPB(String mapb);

}
