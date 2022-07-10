package com.ETicaretApi.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ETicaretApi.Entities.Order;

public interface OrderRepository extends JpaRepository<Order, Integer>{


}
