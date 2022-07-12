package com.ETicaretApi.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ETicaretApi.Entities.Customer;
import com.ETicaretApi.IService.ICustomerService;
import com.ETicaretApi.Repositories.CustomerRepository;
@Service
public class CustomerService implements ICustomerService {

	@Autowired
	private CustomerRepository repo;
	
	@Override
	public String add(Customer data) {
		try {
			//email and phone control
			if(repo.CustomerController(data.email, data.phone) == null) {
				repo.save(data);
				return "Success";
			}else {
				return " Email or Phone is Already Taken!";
			}
			
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	@Override
	public List<Customer> getAll() {
		return repo.findAll();
	}

	@Override
	public Customer getById(int id) {
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
	public String update(Customer data) {
		try {
			repo.save(data);
			return "Success";
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	@Override
	public Customer login(String email, String password) {
		
		return repo.login(email,password);
	}

}
