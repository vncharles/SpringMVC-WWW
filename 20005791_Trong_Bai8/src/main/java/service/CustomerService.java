package service;

import java.util.List;

import entity.Customer;

public interface CustomerService {
	public List<Customer> getAll();
	
	public void save(Customer customer);
	
	public Customer getDetail(int id);
	
	public void delete(int id);
}
