package com.ETicaretApi.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ETicaretApi.Entities.Order;
import com.ETicaretApi.Entities.Product;
import com.ETicaretApi.IService.IOrderService;

import com.ETicaretApi.Repositories.OrderRepository;
import com.ETicaretApi.Repositories.ProductRepository;

@Service
public class OrderService implements IOrderService {

	@Autowired
	private OrderRepository repo;
	
	@Autowired
	private ProductRepository productRepo;

	@Override
	public String add(Order data) {
		try {
			repo.saveAll(List.of(data));
			data.orderDetails.forEach((e)->{
				Product product = productRepo.findById(e.productId).orElse(null);	//satın alınan ürünü depoda buluyor
				product.stock -= e.piece;	//satın alınan ürünü depodaki stok adedinden düşüyor
				productRepo.save(product);
			});
			return "Success";
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	@Override
	public List<Order> getAll() {
		return repo.findAll();
	}

	@Override
	public Order getById(int id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public String update(Order data) {
		try {
			repo.saveAll(List.of(data));
			return "Success";
		} catch (Exception e) {
			return e.getMessage();
		}
	}

}
