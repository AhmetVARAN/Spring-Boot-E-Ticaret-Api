package com.ETicaretApi.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ETicaretApi.Entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
