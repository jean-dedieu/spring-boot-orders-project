package com.cap.shop.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity

public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private Date orderDate;
	@ManyToOne(cascade = CascadeType.MERGE)//ALL cascade to MERGE
	private Customer customer;
	@OneToOne(cascade = CascadeType.MERGE)
	private ShopCar orderedCar;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public ShopCar getOrderedCar() {
		return orderedCar;
	}
	public void setOrderedCar(ShopCar orderedCar) {
		this.orderedCar = orderedCar;
	}
	
	
	


}
