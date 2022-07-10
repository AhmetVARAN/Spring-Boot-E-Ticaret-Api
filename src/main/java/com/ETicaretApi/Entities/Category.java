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
@Table(name="Categories")
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	
	@Column(name="Name", length = 50)
	public String name;

	@Column(name="SubMenu")
	public int subMenu;
	
	@Column(name="Status")
	public boolean status;
	
	/* SEO için gerekli olanlar */
	@Column(name="Keyword", length = 160)
	public String keyword;	//googleda aratıldığında öne çıkarılacak kelimeler
	
	@Column(name="Description", length = 160)
	public String description;	//ürünün kısa açıklaması
}
