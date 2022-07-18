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

import com.ETicaretApi.Entities.Product;
import com.ETicaretApi.Services.ProductService;

@RestController
@RequestMapping("api")
public class ProductController {

	@Autowired
	private ProductService service;
	
	@GetMapping("/products")
	public List<Product> getAllProducts(){
		return service.getAll();
	}
	
	@PostMapping("/products")
	public String createProduct(@RequestBody Product product){
		return service.add(product);
	}
	
	@PutMapping("/products")
	public String updateProduct(@RequestBody Product product){
		return service.update(product);
	}
	
	@DeleteMapping("/products/{id}")
	public String deleteProduct(@PathVariable int id){
		return service.delete(id);
	}
	
}
