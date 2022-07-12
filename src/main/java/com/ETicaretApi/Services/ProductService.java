package com.ETicaretApi.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ETicaretApi.Entities.Product;
import com.ETicaretApi.IService.IProductService;
import com.ETicaretApi.Repositories.ProductRepository;
@Service
public class ProductService implements IProductService{

	@Autowired
	private ProductRepository repo;
	
	@Override
	public String add(Product data) {
		try {
			repo.save(data);
			return "Success";
		} catch (Exception e) {
			return e.getMessage();
		}
	
	}

	@Override
	public List<Product> getAll() {
		return repo.findAll();
	}

	@Override
	public Product getById(int id) {
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
	public String update(Product data) {
		try {
			repo.save(data);
			return "Success";
		} catch (Exception e) {
			return e.getMessage();
		}
	}

}
