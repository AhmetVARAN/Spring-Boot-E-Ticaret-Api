package com.ETicaretApi.IService;

import java.util.List;

import com.ETicaretApi.Entities.Product;

public interface IProductService {
	
	public String add(Product data);
	
	public List<Product> getAll();
	
	public Product getById(int id);
	
	public String delete(int id);
	
	public String update(Product data);
	
}