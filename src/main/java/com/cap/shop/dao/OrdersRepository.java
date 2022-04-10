package com.cap.shop.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cap.shop.entities.Orders;



public interface OrdersRepository extends JpaRepository<Orders, Integer>{
	//public Employe findByNom(String nom);
	
	public Orders findByCustomerId(int customerId);
	
	@Query("SELECT o FROM Orders o WHERE o.id>=:vmin and o.id<=:vmax")
	//public List<Orders> listOrders(@Param("vmin")float min,@Param("vmax") float max);
	public List<Orders> listOrders(@Param("vmin")int min,@Param("vmax") int max);
		
	
}
