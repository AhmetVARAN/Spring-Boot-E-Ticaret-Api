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
@Table(name="orderdetails")
public class OrderDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;

	public int orderId;
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
	@Column(name="piece")
	public int piece;
	@Column(name="productID")
	public int productId;
}
