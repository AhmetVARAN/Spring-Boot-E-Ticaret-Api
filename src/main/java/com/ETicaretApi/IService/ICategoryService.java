package com.ETicaretApi.IService;

import java.util.List;

import com.ETicaretApi.Entities.Category;

public interface ICategoryService {
	public String add(Category data);
	
	public List<Category> getAll();
	
	public Category getById(int id);
	
	public String delete(int id);
	
	public String update(Category data);
}
