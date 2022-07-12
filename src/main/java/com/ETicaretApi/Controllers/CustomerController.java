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

import com.ETicaretApi.Entities.Customer;
import com.ETicaretApi.Services.CustomerService;

@RestController
@RequestMapping("api")
public class CustomerController {
	@Autowired
	private CustomerService service;
	
	@GetMapping("/customers")
	public List<Customer> getAllCustomer(){
		return service.getAll();
	}
	
	@PostMapping("/customers")
	public String createCustomer(@RequestBody Customer customer){
		return service.add(customer);
	}
	
	@PutMapping("/customers")
	public String updateCustomer(@RequestBody Customer customer){
		return service.update(customer);
	}
	
	@DeleteMapping("/customers/{id}")
	public String deleteCustomer(@PathVariable int id){
		return service.delete(id);
	}
	
	@PostMapping("/customers/login")
	public Customer login(String email, String password){
		return service.login(email,password);
	}
	
	
}
