package com.example.qlynhansu.Repositories;

import java.util.List;


import com.example.qlynhansu.Entities.ChucVu;
import org.springframework.data.repository.CrudRepository;

public interface ChucVuResporitory {

	List<ChucVu> LayDanhChucVu();
	
	boolean ThemCV(ChucVu chucvu);
	
	ChucVu LayCV(String macv);
	
	ChucVu SuaCV(String macv, String tencv, String mota);
	
	ChucVu XoaCV(String macv);
}
