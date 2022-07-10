package com.ETicaretApi.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="products")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	@Column(name="name", length = 150)
	public String name;
	@Column(name="images", length = 30)
	public String images;
	@Column(name="explanations", length = 150)
	public String explanation;
	@Column(name="price")
	public float price;
	@Column(name="discountPrice")
	public float discountPrice;
	@Column(name="stock")
	public int stock;
	@Column(name="status")
	public boolean status;
	@Column(name="categoryID")
	public int categoryId;
	
	/* SEO için gerekli olanlar */
	@Column(name="keyword", length = 160)
	public String keyword;	//googleda aratıldığında öne çıkarılacak kelimeler	
	@Column(name="description", length = 160)
	public String description;	//ürünün kısa açıklaması
}
