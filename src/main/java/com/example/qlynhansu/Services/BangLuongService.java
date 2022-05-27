package com.example.qlynhansu.Services;

import java.util.List;

import com.example.qlynhansu.DAO.BangLuongDAO;
import com.example.qlynhansu.Entities.BangLuong;
import com.example.qlynhansu.Repositories.BangLuongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class BangLuongService implements BangLuongRepository {
	
	@Autowired
	BangLuongDAO bangluongDAO;

	public List<BangLuong> LayDanhLuong() {
		
		return bangluongDAO.LayDanhLuong();
	}
	

}
