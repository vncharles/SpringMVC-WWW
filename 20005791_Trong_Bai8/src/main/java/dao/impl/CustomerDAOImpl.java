package dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import dao.CustomerDAO;
import entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO{
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<Customer> getAll() {
		Session session;

		try {
		    session = sessionFactory.getCurrentSession();
		} catch (HibernateException e) {
		    session = sessionFactory.openSession();
		}
		
		List<Customer> list = session.createQuery("from Customer").list();
		
		return list;
	}

	@Override
	public void save(Customer customer) {
		// TODO Auto-generated method stub
		Session session;
		try {
		    session = sessionFactory.getCurrentSession();
		} catch (HibernateException e) {
		    session = sessionFactory.openSession();
		}
		
		if(customer.getId()>0) {
//			Query query = session.createQuery("update Customer set first_name=:firstName, last_name=:lastName, email=:email where id=:id");
//			query.setParameter("id", customer.getId());
//			query.setParameter("firstName", customer.getFirstName());
//			query.setParameter("lastName", customer.getLastName());
//			query.setParameter("email", customer.getEmail());
//			
//			query.executeUpdate();
			session.update(customer);
		}
		else session.save(customer);
	}

	@Override
	public Customer getDetail(int id) {
		// TODO Auto-generated method stub
		Session session;
		try {
		    session = sessionFactory.getCurrentSession();
		} catch (HibernateException e) {
		    session = sessionFactory.openSession();
		}
		
		Customer customer = (Customer) session.get(Customer.class, id);
		
		return customer;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		Session session;
		try {
		    session = sessionFactory.getCurrentSession();
		} catch (HibernateException e) {
		    session = sessionFactory.openSession();
		}
		
		Query query = session.createQuery("delete from Customer where id=:id");
		query.setParameter("id", id);
		
		query.executeUpdate();
	}

}
