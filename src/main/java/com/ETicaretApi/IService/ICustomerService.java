package com.ETicaretApi.IService;

import java.util.List;

import com.ETicaretApi.Entities.Customer;

public interface ICustomerService {
	
	public String add(Customer data);
	
	public List<Customer> getAll();
	
	public Customer getById(int id);
	
	public String delete(int id);
	
	public String update(Customer data);
	
	public Customer login(String email, String password);
}
