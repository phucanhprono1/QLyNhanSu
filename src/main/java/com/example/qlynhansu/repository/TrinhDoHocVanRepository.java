package com.example.qlynhansu.repository;

import java.util.List;

import com.example.qlynhansu.model.TrinhDoHocVan;

public interface TrinhDoHocVanRepository {
	
	List<TrinhDoHocVan> LayDSTrinhDoHV();

	boolean ThemHV(TrinhDoHocVan hocvan);
	
	TrinhDoHocVan LayHocVan(String mahv);
	
	TrinhDoHocVan SuaHV(String mahv, String tenhv, String chuyennganh);
	
	TrinhDoHocVan XoaHV(String mahv);
}
