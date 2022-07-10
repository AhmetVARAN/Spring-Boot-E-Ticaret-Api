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
@Table(name="customeraddress")
public class CustomerAddress {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	@Column(name="customerID",length=50)
	public int customerId;
	@Column(name="addressName",length=50)
	public String addressName;
	@Column(name="city",length=50)
	public String city;
	@Column(name="fullAddress",length=350)
	public String fullAddress;
}
