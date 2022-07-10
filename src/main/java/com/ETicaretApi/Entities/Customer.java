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
@Table(name="Customers")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	@Column(name="Name", length = 30)
	public String name;
	@Column(name="Surname", length = 30)
	public String surname;
	@Column(name="Email", length = 50)
	public String email;
	@Column(name="Password", length = 20)
	public String password;
	@Column(name="Phone", length = 20)
	public String phone;
	@Column(name="Status")
	public boolean status;
	
}
