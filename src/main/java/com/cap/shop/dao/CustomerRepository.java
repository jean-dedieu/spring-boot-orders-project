package com.cap.shop.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cap.shop.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
