package com.ETicaretApi.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ETicaretApi.Entities.Category;
import com.ETicaretApi.IService.ICategoryService;
import com.ETicaretApi.Repositories.CategoryRepository;

@Service
public class CategoryService implements ICategoryService {

	@Autowired
	private CategoryRepository repo;
	
	@Override
	public String add(Category data) {
		try {
			repo.save(data);
			return "Success";
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	@Override
	public List<Category> getAll() {
		return repo.findAll();
	}

	@Override
	public Category getById(int id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public String delete(int id) {
		try {
			repo.deleteById(id);
			return "Success";
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	@Override
	public String update(Category data) {
		try {
			repo.save(data);
			return "Success";
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	
	
}
