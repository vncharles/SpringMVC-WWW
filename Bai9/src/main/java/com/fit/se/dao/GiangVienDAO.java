package com.fit.se.dao;

import java.util.List;

import com.fit.se.entity.GiangVien;

public interface GiangVienDAO {
	List<GiangVien> getAll();
	
	GiangVien getDetail(int id);
	
	void save(GiangVien giangVien);
	
	void delete(int id);
}
