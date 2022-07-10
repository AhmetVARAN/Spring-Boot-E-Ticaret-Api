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
@Table(name="ordercustomers")
public class OrderCustomer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	
	public int orderId;
	@Column(name="customerName", length = 50)
	public String customerName;
	@Column(name="city", length = 50)
	public String city;
	@Column(name="distrinct", length = 50)
	public String distrinct;
	@Column(name="fullAdress", length = 350)
	public String fullAddress;
	@Column(name="phone", length = 20)
	public String phone;
	
	public boolean status;	//True->teslim edildi, False->teslim edilmedi
	
	
}
