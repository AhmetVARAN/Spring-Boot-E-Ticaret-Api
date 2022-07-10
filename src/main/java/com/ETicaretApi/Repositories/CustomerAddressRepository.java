package com.ETicaretApi.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ETicaretApi.Entities.CustomerAddress;

public interface CustomerAddressRepository extends JpaRepository<CustomerAddress, Integer>{

}
