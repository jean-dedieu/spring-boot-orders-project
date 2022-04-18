package com.cap.shop.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cap.shop.entities.ShoppingCart;

public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long>{
	ShoppingCart findBySessionToken(String sessionToken);

}
