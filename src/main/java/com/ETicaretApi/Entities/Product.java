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
@Table(name="Products")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	@Column(name="Name", length = 150)
	public String name;
	@Column(name="Images", length = 30)
	public String images;
	@Column(name="Explanations", length = 150)
	public String explanation;
	@Column(name="Price")
	public float price;
	@Column(name="DiscountPrice")
	public float discountPrice;
	@Column(name="Stock")
	public int stock;
	@Column(name="Status")
	public boolean status;
	@Column(name="CategoryID")
	public int categoryId;
	
	/* SEO için gerekli olanlar */
	@Column(name="Keyword", length = 160)
	public String keyword;	//googleda aratıldığında öne çıkarılacak kelimeler
	
	@Column(name="Description", length = 160)
	public String description;	//ürünün kısa açıklaması
}
