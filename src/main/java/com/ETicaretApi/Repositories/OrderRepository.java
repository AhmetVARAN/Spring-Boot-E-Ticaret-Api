package com.ETicaretApi.Repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ETicaretApi.Entities.Order;

public interface OrderRepository extends JpaRepository<Order, Integer>{

	@Query(value = "SELECT * FROM orders as o JOIN ordercustomers as c on c.order_id = o.id JOIN orderdetails as d on o.id = c.order_id JOIN customers as cu on cu.id = o.customer_id WHERE o.id =:orderId",nativeQuery = true)
	public Order orderCustomerDetail(@Param("orderId") int orderId);
	
	@Query(value = "SELECT * FROM orders as o JOIN ordercustomers as c on c.order_id = o.id JOIN orderdetails as d on o.id = c.order_id JOIN customers as cu on cu.id = o.customer_id",nativeQuery = true)
	public Order getAllOrderCustomerDetail();
}
