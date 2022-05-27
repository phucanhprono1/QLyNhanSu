package com.example.qlynhansu.repository;

import java.util.List;


import com.example.qlynhansu.model.ChucVu;

public interface ChucVuResporitory {

	List<ChucVu> LayDanhChucVu();
	
	boolean ThemCV(ChucVu chucvu);
	
	ChucVu LayCV(String macv);
	
	ChucVu SuaCV(String macv, String tencv, String mota);
	
	ChucVu XoaCV(String macv);
}
