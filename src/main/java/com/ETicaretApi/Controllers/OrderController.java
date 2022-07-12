package com.ETicaretApi.Controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ETicaretApi.Entities.Order;
import com.ETicaretApi.Services.OrderService;

@RestController
@RequestMapping("api")
public class OrderController {
	
	@Autowired
	private OrderService service;
	@GetMapping("/orders")
	public List<Order> getAll(){
		return service.getAll();
	}
	@GetMapping("/orders/first/{id}")
	public Order getById(@PathVariable int id) {
		return service.getById(id);
	}
	@PostMapping("/orders")
	public String create(@RequestBody Order data) {
		return service.add(data);
	}
	@PutMapping("/orders")
	public String update(@RequestBody Order data) {
		return service.update(data);
	}
}
