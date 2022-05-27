package com.example.qlynhansu.Repositories;

import java.util.List;

import com.example.qlynhansu.Entities.TrinhDoHocVan;
import org.springframework.data.repository.CrudRepository;

public interface TrinhDoHocVanRepository extends CrudRepository<TrinhDoHocVan,String> {
	
	List<TrinhDoHocVan> LayDSTrinhDoHV();

	boolean ThemHV(TrinhDoHocVan hocvan);
	
	TrinhDoHocVan LayHocVan(String mahv);
	
	TrinhDoHocVan SuaHV(String mahv, String tenhv, String chuyennganh);
	
	TrinhDoHocVan XoaHV(String mahv);
}
