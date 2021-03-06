package com.ETicaretApi.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ETicaretApi.Entities.Category;
import com.ETicaretApi.Services.CategoryService;


@RestController
@RequestMapping("api")
public class CategoryController {

	@Autowired
	private CategoryService service;
	
	@GetMapping("/category")
	public List<Category> getAllCategory(){
		return service.getAll();
	}
	
	@PostMapping("/category")
	public String createCategory(@RequestBody Category category){
		return service.add(category);
	}
	
	@PutMapping("/category")
	public String updateCategory(@RequestBody Category category){
		return service.update(category);
	}
	
	@DeleteMapping("/category/{id}")
	public String deleteCategory(@PathVariable int id){
		return service.delete(id);
	}
	

	
}
