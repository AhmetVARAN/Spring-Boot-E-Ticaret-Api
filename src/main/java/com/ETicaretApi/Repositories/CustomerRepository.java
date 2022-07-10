package com.ETicaretApi.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ETicaretApi.Entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	//tüm verileri çekme findAll();
	//tek satır listeleme findById();
	//veri ekleme save();
	//veri güncelleme save();
	//veri silme delete();
	
	//eğer repository içindeki metodlar dışında sorgulama yapılacaksa bu interface içine yeni soyut metodlar tanımlanır

	@Query("SELECT * FROM Customers Where email = :email AND password = :password")
	public Customer login(@Param("email")String email, @Param("password")String password);


}
