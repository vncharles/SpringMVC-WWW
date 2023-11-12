package com.fit.se.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fit.se.dao.GiangVienDAO;
import com.fit.se.entity.GiangVien;
import com.fit.se.service.GiangVienService;

@Service
//@Transactional
public class GiangVienServiceImpl implements GiangVienService {
	@Autowired 
	private GiangVienDAO giangVienDAO;

	@Override
	public List<GiangVien> getAll() {
		// TODO Auto-generated method stub
		return giangVienDAO.getAll();
	}

	@Override
	public GiangVien getDetail(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(GiangVien giangVien) {
		// TODO Auto-generated method stub
		giangVienDAO.save(giangVien);
	}

	@Override
	public void update(int id, GiangVien giangVien) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}
	
	
}
