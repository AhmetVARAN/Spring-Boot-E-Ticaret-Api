package com.ETicaretApi.IService;

import java.util.List;

import com.ETicaretApi.Entities.TemporaryBasket;

public interface ITemporaryBasket {

	public String add(TemporaryBasket data);
	
	public List<TemporaryBasket> getAll(int cookieId);
	
	public TemporaryBasket getById(int id);
	
	public String delete(int id);
	
	public String update(int basketId,boolean status);
	
}
