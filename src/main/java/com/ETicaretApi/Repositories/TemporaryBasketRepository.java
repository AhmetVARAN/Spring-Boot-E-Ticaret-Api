package com.ETicaretApi.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ETicaretApi.Entities.Order;
import com.ETicaretApi.Entities.TemporaryBasket;

public interface TemporaryBasketRepository extends JpaRepository<TemporaryBasket, Integer> {

	@Query(value="SELECT * FROM temporarybasket WHERE cookie_basket_id = :cookieId LIMIT 1",nativeQuery = true)
	public TemporaryBasket BasketCookieControl(@Param("cookieId") int cookieId);
	
	@Query(value="SELECT * FROM orders WHERE id = :cookieId LIMIT 1",nativeQuery = true)
	public Order OrderCookieControl(@Param("cookieId") int cookieId);
	
	@Query(value="SELECT * FROM temporarybasket WHERE cookie_basket_id = :cookieId LIMIT 1",nativeQuery = true)
	public List<TemporaryBasket> getAllList(@Param("cookieId") int cookieId);
	
	//bir ürün aynı kullanıcı tarafından daha önce sepete eklenmişse adeti yükseltilsin
	@Query(value="SELECT * FROM temporarybasket WHERE id = :basketId",nativeQuery = true)
	public TemporaryBasket basketUnitControl(@Param("basketId") int basketId);
}
