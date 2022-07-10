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
@Table(name="customers")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	@Column(name="name", length = 30)
	public String name;
	@Column(name="surname", length = 30)
	public String surname;
	@Column(name="email", length = 50)
	public String email;
	@Column(name="password", length = 20)
	public String password;
	@Column(name="phone", length = 20)
	public String phone;
	@Column(name="status")
	public boolean status;
	
}
