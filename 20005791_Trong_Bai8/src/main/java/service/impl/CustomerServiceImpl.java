package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.CustomerDAO;
import entity.Customer;
import service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerDAO customerDAO;

	@Override
	@Transactional
	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		return customerDAO.getAll();
	}

	@Override
	@Transactional
	public void save(Customer customer) {
		// TODO Auto-generated method stub
		customerDAO.save(customer);
	}

	@Override
	@Transactional
	public Customer getDetail(int id) {
		// TODO Auto-generated method stub
		return customerDAO.getDetail(id);
	}

	@Override
	@Transactional
	public void delete(int id) {
		// TODO Auto-generated method stub
		customerDAO.delete(id);
	}
	
}
