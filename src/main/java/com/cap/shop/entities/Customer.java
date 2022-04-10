package com.cap.shop.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer extends User{
	

	private String paymentCardNumber;
	
	public String getPaymentCardNumber() {
		return paymentCardNumber;
	}
	public void setPaymentCardNumber(String paymentCardNumber) {
		this.paymentCardNumber = paymentCardNumber;
	}

	

}
