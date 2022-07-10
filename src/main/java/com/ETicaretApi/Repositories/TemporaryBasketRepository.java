package com.ETicaretApi.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ETicaretApi.Entities.TemporaryBasket;

public interface TemporaryBasketRepository extends JpaRepository<TemporaryBasket, Integer> {

	@Query(value="SELECT * FROM temporaryBasket WHERE cookieBasketId = :cookieId LIMIT 1",nativeQuery = true)
	public boolean BasketCookieControl(@Param("cookieId") int dookieId);
}
