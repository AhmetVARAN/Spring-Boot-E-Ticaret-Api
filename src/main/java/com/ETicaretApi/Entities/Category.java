package com.ETicaretApi.Entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="categories")
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	
	@Column(name="name", length = 50)
	public String name;

	@Column(name="subMenu")
	public int subMenu;
	
	@Column(name="status")
	public boolean status;
	
	// SEO için gerekli olanlar 
	@Column(name="keyword", length = 160)
	public String keyword;	//googleda aratıldığında öne çıkarılacak kelimeler
	
	@Column(name="description", length = 160)
	public String description;	//ürünün kısa açıklaması
	
	// @OneToMany
	// @JoinColumn(name="categoryId")	//Category.id=Product.categoryId;
	// public List<Product> Product;
	
	
	
}
