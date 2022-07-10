package com.ETicaretApi.Entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
@Table(name="Orders")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;
	@Column(name="OrderStatus", length = 30)	//on cargo, waiting etc
	public String orderStatus;
	@Column(name="CargoNumber", length = 30)
	public String cargoNumber;

	@Column(name="TotalPrice")
	public float totalPrice;
	@Column(name="TotalDiscountPrice")
	public float totalDiscountPrice;
	@Column(name="KDV")
	public float KDV;
	@Temporal(TemporalType.DATE)
	public Date orderDate;
	@Column(name="CustomerID")
	public int customerId;
	@Column(name="PaymentType")
	public String paymentType;	//credit cart, cash etc
	
}
