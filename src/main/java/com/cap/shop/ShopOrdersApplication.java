package com.cap.shop;

import java.util.Date;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cap.shop.dao.CustomerRepository;
import com.cap.shop.dao.OrdersRepository;
import com.cap.shop.dao.ShopCarRepository;
import com.cap.shop.entities.Customer;
import com.cap.shop.entities.Orders;
import com.cap.shop.entities.ShopCar;


@SpringBootApplication
public class ShopOrdersApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(ShopOrdersApplication.class, args);
		ShopCarRepository carRepository  = context.getBean(ShopCarRepository.class);
		CustomerRepository customerRepository = context.getBean(CustomerRepository.class);
		OrdersRepository orderRepository = context.getBean(OrdersRepository.class);
	
		
		
	
		
		//create ShopCar
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
		car2.setColor("Blue");
		car2.setTotalPrice(800000);
		car2.setMonthlyAmount(20000);
		car2.setTva(56000);
		car2.setDeliveryDate(new Date());
		
		ShopCar car3 = new ShopCar();
		car3.setId(2);
		car3.setModel("Cadillac");
		car3.setBrand("Limousine");
		car3.setColor("Crystal");
		car3.setTotalPrice(1000000);
		car3.setMonthlyAmount(200000);
		car3.setTva(80000);
		car3.setDeliveryDate(new Date());
		
		
		ShopCar car4 = new ShopCar();
		car4.setId(3);
		car4.setModel("Batmobile");
		car4.setBrand("Batman");
		car4.setColor("Crystal");
		car4.setTotalPrice(2000000);
		car4.setMonthlyAmount(20000);
		car4.setTva(90000);
		car4.setDeliveryDate(new Date());
		
		ShopCar car5 = new ShopCar();
		car5.setId(4);
		car5.setModel("Aston Martin One-77");
		car5.setBrand("Aston Martin");
		car5.setColor("Gray");
		car5.setTotalPrice(780000);
		car5.setMonthlyAmount(210000);
		car5.setTva(100000);
		car5.setDeliveryDate(new Date());
		
		
		
		
		//second cars simulation to be 10
		
		
		
		
		
		ShopCar car6 = new ShopCar();
		car6.setId(5);
		car6.setModel("Rolls-Royce White Ghost Limited");
		car6.setBrand("Rolls-Royce");
		car6.setColor("White");
		car6.setTotalPrice(4000000);
		car6.setMonthlyAmount(100000);
		car6.setTva(80000);
		car6.setDeliveryDate(new Date());
		
		
		ShopCar car7 = new ShopCar();
		car7.setId(6);
		car7.setModel("La Rolls-Royce Dawn");
		car7.setBrand("Rolls-Royce");
		car7.setColor("Blue");
		car7.setTotalPrice(800000);
		car7.setMonthlyAmount(20000);
		car7.setTva(56000);
		car7.setDeliveryDate(new Date());
		
		ShopCar car8 = new ShopCar();
		car8.setId(7);
		car8.setModel("V8 Vantage");
		car8.setBrand("Aston Martin ");
		car8.setColor("Yellow");
		car8.setTotalPrice(7000000);
		car8.setMonthlyAmount(100000);
		car8.setTva(60000);
		car8.setDeliveryDate(new Date());
		
		
		ShopCar car9 = new ShopCar();
		car9.setId(8);
		car9.setModel("Roadster MF5");
		car9.setBrand(" Wiesmann");
		car9.setTotalPrice(7000000);
		car9.setMonthlyAmount(80000);
		car9.setTva(50000);
		car9.setDeliveryDate(new Date());
		
		ShopCar car10 = new ShopCar();
		car10.setId(9);
		car10.setModel("Aston Martin One-77");
		car10.setBrand("Aston Martin");
		car10.setColor("Gray");
		car10.setTotalPrice(780000);
		car10.setMonthlyAmount(210000);
		car10.setTva(100000);
		car10.setDeliveryDate(new Date());
		
		
		
		ShopCar car11 = new ShopCar();
		car11.setId(11);
		car11.setModel("911 Targa 4S");
		car11.setBrand("Porsche");
		car11.setColor("Gray");
		car11.setTotalPrice(980000);
		car11.setMonthlyAmount(110000);
		car11.setTva(800000);
		car11.setDeliveryDate(new Date());
		
		
		
		ShopCar car12 = new ShopCar();
		car12.setId(12);
		car12.setModel(" C8");
		car12.setBrand("Spyker");
		car12.setColor("Black");
		car12.setTotalPrice(680000);
		car12.setMonthlyAmount(410000);
		car12.setTva(630000);
		car12.setDeliveryDate(new Date());
		
		//end simulation
		carRepository.save(car1);
		carRepository.save(car2);
		carRepository.save(car3);
		carRepository.save(car4);
		carRepository.save(car5);
		carRepository.save(car6);
		carRepository.save(car7);
		carRepository.save(car8);
		carRepository.save(car9);
		carRepository.save(car10);
		carRepository.save(car11);
		carRepository.save(car12);
		
		
		
		
		
				//Create customer
				Customer customer1  = new Customer();
				//customer1.setId(1);
				customer1.setFirstName("John");
				customer1.setLastName("Doe");
				customer1.setEmailAddress("mail@test.com");
				customer1.setPassWord("helt$-+*ver%!ZAR");
				customer1.setPaymentCardNumber("4242 4242 4242 4242");
				customerRepository.save(customer1);
				
				//test order
				//Create order
				Orders order1 = new Orders();
				order1.setOrderDate(new Date());
				
				Orders order2 = new Orders();
				order2.setOrderDate(new Date());
				
				Customer customer2  = new Customer();
				
				customer2.setId(2);
				customer2.setFirstName("Eric");
				customer2.setLastName("Dupont");
				customer2.setEmailAddress("mail1@test.com");
				customer2.setPassWord("BED+-LIT12354zbar?!%");
				customer2.setPaymentCardNumber("4243 4242 4242 4242");
				//order1.setClient(customer2);
				
				order1.setCustomer(customer2);
				order2.setCustomer(customer1);
				customerRepository.save(customer2);
				orderRepository.save(order2);
			
				orderRepository.save(order1);
				
           //loop through orders
				List<Orders> listOrders = orderRepository.findAll();
				for(Orders o : listOrders) {
					System.out.println( o.getId() + 
							"\t" + o.getOrderDate() 
							+"\t"+o.getCustomer().getFirstName()
							+"\t" + o.getCustomer().getLastName()
							+"\t" + o.getCustomer().getEmailAddress()
							+"\t" + o.getCustomer().getPassWord()
							+"\t" + o.getCustomer().getPaymentCardNumber()
							
							
							);
					
				}
				
				
				
				/*List<ShopCar> listCars = carRepository.findAll();
				order1.setCarsList(listCars);*/
				
				 //eventRepository.save(event);
				
	}

}
