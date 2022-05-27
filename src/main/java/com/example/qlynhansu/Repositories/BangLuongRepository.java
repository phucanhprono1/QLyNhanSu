package com.example.qlynhansu.Repositories;

import java.util.List;


import com.example.qlynhansu.Entities.BangLuong;
import org.springframework.data.repository.CrudRepository;


public interface BangLuongRepository extends CrudRepository<BangLuong,String > {
	
	List<BangLuong> LayDanhLuong();

}
