package com.ETicaretApi.Entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
@Table(name="orders")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;
	@Column(name="orderStatus", length = 30)	//on cargo, waiting etc
	public String orderStatus;
	@Column(name="cargoNumber", length = 30)
	public String cargoNumber;
	@Column(name="totalPrice")
	public float totalPrice;
	@Column(name="totalDiscountPrice")
	public float totalDiscountPrice;
	@Column(name="KDV")
	public float KDV;
	@Temporal(TemporalType.DATE)
	public Date orderDate;
	@Column(name="customerID")
	public int customerId;
	@Column(name="paymentType")
	public String paymentType;	//credit cart, cash etc
	@OneToMany
	@JoinColumn(name="orderId", insertable = true)
	public List<OrderCustomer> orderCustomers;
	@OneToMany
	@JoinColumn(name="orderId",insertable = true)
	public List<OrderDetail> orderDetails;
}
