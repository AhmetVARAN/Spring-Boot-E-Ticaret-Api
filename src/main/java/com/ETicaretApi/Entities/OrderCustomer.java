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
@Table(name="OrderCustomers")
public class OrderCustomer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	@Column(name="AddressName", length = 50)
	public String addressName;
	@Column(name="City", length = 50)
	public String city;
	@Column(name="Distrinct", length = 50)
	public String distrinct;
	@Column(name="FullAdress", length = 350)
	public String fullAddress;
	@Column(name="Phone", length = 20)
	public String phone;
	
	public boolean status;	//True->teslim edildi, False->teslim edilmedi
	
	
}
