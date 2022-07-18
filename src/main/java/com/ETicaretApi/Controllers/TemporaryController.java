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


import com.ETicaretApi.Entities.TemporaryBasket;
import com.ETicaretApi.Services.TemporaryBasketService;

@RestController
@RequestMapping("/api")
public class TemporaryController {
	
	@Autowired
	private TemporaryBasketService service;
	
	@GetMapping("/temporary/get/{id}")
	public List<TemporaryBasket> getAll(int id){
		return service.getAll(id);
	}
	
	@PostMapping("/temporary")
	public String create(@RequestBody TemporaryBasket data) {
		return service.add(data);
	}
	
	@PutMapping("/temporary")
	public String update(int basketId, boolean status) {
		return service.update(basketId,status);
	}
	
	@DeleteMapping("/temporary/{id}")
	public String delete(@PathVariable int id) {
		return service.delete(id);
	}
	
}
