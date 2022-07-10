package com.ETicaretApi.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ETicaretApi.Entities.OrderCustomer;

public interface OrderCustomerRepository extends JpaRepository<OrderCustomer, Integer> {

}
