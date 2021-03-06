package com.cap.shop.entities;

import java.text.SimpleDateFormat;
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
	// private SimpleDateFormat orderDate;
	@ManyToOne(cascade = CascadeType.MERGE) // ALL cascade to MERGE
	private Customer customer;
	@OneToOne(cascade = CascadeType.MERGE)//Bug OneToMany
	private ShopCar orderedCar;

	// getters and setters
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
	/*
	 * public SimpleDateFormat getOrderDate() { return orderDate; } public void
	 * setOrderDate(SimpleDateFormat orderDate) { this.orderDate = orderDate; }
	 */

}
