package com.cap.shop.entities;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;



@Entity
public class ShopCar extends StockCar{
	
	private float totalPrice;
	private float monthlyAmount;
	private float tva;
	//private Date deliveryDate;
	//SimpleDateFormat deliveryDate;
	
	@OneToOne(cascade = CascadeType.MERGE)
	private Orders order;
	
	public float getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}
	public float getMonthlyAmount() {
		return monthlyAmount;
	}
	public void setMonthlyAmount(float monthlyAmount) {
		this.monthlyAmount = monthlyAmount;
	}
	public float getTva() {
		return tva;
	}
	public void setTva(float tva) {
		this.tva = tva;
	}
	/*
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}*/
	
	/*public SimpleDateFormat getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(SimpleDateFormat deliveryDate) {
		this.deliveryDate = deliveryDate;
	}*/
	public Orders getOrder() {
		return order;
	}
	public void setOrder(Orders order) {
		this.order = order;
	}
	
	

}
