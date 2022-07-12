package com.ETicaretApi.Services;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ETicaretApi.Entities.Product;
import com.ETicaretApi.Entities.TemporaryBasket;
import com.ETicaretApi.IService.ITemporaryBasket;
import com.ETicaretApi.Repositories.ProductRepository;
import com.ETicaretApi.Repositories.TemporaryBasketRepository;

@Service
public class TemporaryBasketService implements ITemporaryBasket{

	@Autowired
	private TemporaryBasketRepository repo;
	@Autowired
	private ProductRepository productRepo;
	
	@Override
	public String add(TemporaryBasket data) {
		int basketCookieId = 0;
		Random rnd = new Random();
		//üretilen sayı temporary basket ve order tablosunda var ise tekrar sayı üretecek, yok ise üretilen ile devam edecek
		do {
			basketCookieId = rnd.nextInt(9000000);	//0-9000000
			
		}while((repo.BasketCookieControl(basketCookieId) != null) || (repo.OrderCookieControl(basketCookieId) != null));
			data.CookiesBasketId = basketCookieId;	//üretileni veritabanına göndermek üzere property'e atandı
			try {
				repo.save(data);
				return "Success";
			} catch (Exception e) {
				return e.getMessage();
			}
	}

	@Override
	public List<TemporaryBasket> getAll(int cookieId) {
		return repo.getAllList(cookieId);
	}

	@Override
	public TemporaryBasket getById(int id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public String delete(int id) {
		try {
			repo.deleteById(id);
			return "Success";
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	@Override
	public String update(int basketId, boolean status) {
		
		TemporaryBasket dataControl = repo.basketUnitControl(basketId);	
	
		try {
			if(dataControl != null) {
				Product stockProduct= productRepo.findById(dataControl.productId).orElse(null);
				if(status) {	//increase unit				
					if(stockProduct.stock > dataControl.piece) {		//ürünün depodaki stok durumu kontrolü
						dataControl.piece++;	//depodaki ürün, alınmak istenen yüksekse arttır
					}else {
						return "Maximum"+stockProduct.stock+"Unit Can be Taken";
					}
					
				}else {		//decrease unit
					if(stockProduct.stock < dataControl.piece) {
						dataControl.piece--;
					}else {
						return "Minimum 1 Unit Can be Taken";
					}
				}
			}
			repo.save(dataControl);
			return "Success";
		} catch (Exception e) {
			return e.getMessage();
		}
	}

}
