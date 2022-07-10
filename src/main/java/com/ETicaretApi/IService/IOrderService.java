package com.ETicaretApi.IService;

import java.util.List;

import com.ETicaretApi.Entities.Order;


public interface IOrderService {
	
	public String add(Order data);
	
	public List<Order> getAll(int cookieId);
	
	public Order getById(int id);
	
	public String update(Order data);

}