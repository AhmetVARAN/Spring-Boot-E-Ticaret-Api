package com.ETicaretApi.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ETicaretApi.Entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
