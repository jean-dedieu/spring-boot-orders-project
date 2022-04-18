package com.cap.shop.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.shop.dao.ShopCarRepository;
import com.cap.shop.dao.ShoppingCartRepository;
import com.cap.shop.entities.CartItem;
import com.cap.shop.entities.ShopCar;
import com.cap.shop.entities.ShoppingCart;

@Service
public class ShoppingCartService {
	@Autowired
	private ShoppingCartRepository shoppingCartRepository;
	@Autowired
	private ShopCarRepository carRepository;

	public ShoppingCart addShoppingCartFirstTime(Integer id, String sessionToken, int quantity) {
		 
		  ShoppingCart shoppingCart = new ShoppingCart();
		  CartItem cartItem = new CartItem();
		  cartItem.setQuantity(quantity);
		  cartItem.setDate(new Date());
		  cartItem.setShopCar(carRepository.findShopCarById(id));
		  shoppingCart.getItems().add(cartItem);
		  shoppingCart.setSessionToken(sessionToken);
		  return shoppingCartRepository.save(shoppingCart);

	}

	public ShoppingCart  addToExistingShoppingCart(Integer id, String sessionToken, int quantity) {
		
      ShoppingCart shoppingCart = shoppingCartRepository.findBySessionToken(sessionToken);
      ShopCar car = carRepository.findShopCarById(id);
      for(CartItem item : shoppingCart.getItems()) {
    	  if(car.getId()==(item.getShopCar().getId())) {
    		  item.setQuantity(item.getQuantity()+quantity);
    		    return shoppingCartRepository.save(shoppingCart);
    	  }
      }
      CartItem cartItem = new CartItem();
      cartItem.setDate(new Date());
      cartItem.setQuantity(quantity);
      cartItem.setShopCar(car);
      shoppingCart.getItems().add(cartItem);
      
      return shoppingCartRepository.save(shoppingCart);

	}

}
