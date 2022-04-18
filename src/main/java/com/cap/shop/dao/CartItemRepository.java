package com.cap.shop.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cap.shop.entities.CartItem;
@Repository
public interface CartItemRepository extends JpaRepository<CartItem, Integer>{

}
