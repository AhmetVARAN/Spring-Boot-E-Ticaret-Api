package com.ETicaretApi.IService;

import java.util.List;

import com.ETicaretApi.Entities.CustomerAddress;

public interface ICustomerAddressService {

	public String add(CustomerAddress data);
	
	public List<CustomerAddress> getAll(int customerId);
	
	public CustomerAddress getById(int id);
	
	public String delete(int id);
	
	public String update(CustomerAddress data);
}
