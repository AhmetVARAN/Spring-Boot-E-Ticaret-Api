package com.ETicaretApi.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.ETicaretApi.IService.ICategoryService;

@RestController
public class CategoryController {

	@Autowired
	ICategoryService service;

	public CategoryController() {
		
	}
}
