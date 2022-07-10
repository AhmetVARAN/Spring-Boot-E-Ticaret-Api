package com.ETicaretApi.IService;

import com.ETicaretApi.Entities.CustomerAddress;

public interface IOrderCustomerService {

	public String add(CustomerAddress data);
	
	public CustomerAddress getById(int id);
	
	public String delete(int id);
	
	public String update(CustomerAddress data);
	
}
