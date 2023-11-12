package dao;

import java.util.List;

import entity.Customer;

public interface CustomerDAO {
	public List<Customer> getAll();
	
	public void save(Customer customer);
	
	public Customer getDetail(int id);
	
	public void delete(int id);
}
