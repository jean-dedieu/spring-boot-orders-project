package com.cap.shop;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cap.shop.dao.ShopCarRepository;
import com.cap.shop.entities.ShopCar;

@SpringBootApplication
public class ShopOrdersApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(ShopOrdersApplication.class, args);
		ShopCarRepository carRepository  = context.getBean(ShopCarRepository.class);
		
		ShopCar car1 = new ShopCar();
		car1.setModel("Mazda780");
		car1.setBrand("Mazda");
		car1.setColor("Red");
		car1.setTotalPrice(400000);
		car1.setMonthlyAmount(10000);
		car1.setTva(8000);
		car1.setDeliveryDate(new Date());
		
		
		
		
		ShopCar car2 = new ShopCar();
		car2.setId(1);
		car2.setModel("Lambo2022");
		car2.setBrand("Lamborghini");
		car2.setColor("BLue");
		car2.setTotalPrice(800000);
		car2.setMonthlyAmount(20000);
		car2.setTva(56000);
		car2.setDeliveryDate(new Date());
		carRepository.save(car1);
		carRepository.save(car2);
	}

}
