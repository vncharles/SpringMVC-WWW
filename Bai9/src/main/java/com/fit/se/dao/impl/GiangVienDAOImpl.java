package com.fit.se.dao.impl;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.fit.se.dao.GiangVienDAO;
import com.fit.se.entity.GiangVien;

@Repository
public class GiangVienDAOImpl implements GiangVienDAO {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<GiangVien> getAll() {
		Session session = null;
		try {
			session = sessionFactory.openSession();

			Query query = session.createQuery("from GiangVien");
			
			List<GiangVien> list = query.list();
			
			return list;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			session.close();
		}
		return null;
	} 

	@Override
	public GiangVien getDetail(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public void save(GiangVien giangVien) {
		// TODO Auto-generated method stub
		Session session = null;
		try {
			session = sessionFactory.openSession();
			
			if(giangVien.getMaGV()>0) {
				Query query = session.createQuery("update GiangVien set tenGV=:tenGV, linhVucNghienCuu=:linhVucNghienCuu, "
									+ "dienThoai=:dienThoai, email=:email where maGV=:maGV");
				
				query.setParameter("tenGV", giangVien.getTenGV());
				query.setParameter("linhVucNghienCuu", giangVien.getLinhVucNghienCuu());
				query.setParameter("dienThoai", giangVien.getDienThoai());
				query.setParameter("email", giangVien.getEmail());
				query.setParameter("maGV", giangVien.getMaGV());
				
				query.executeUpdate();
			}
			else session.save(giangVien);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}
	
}
