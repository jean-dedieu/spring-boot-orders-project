package com.cap.shop.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cap.shop.dao.OrdersRepository;
import com.cap.shop.entities.Orders;

@Controller
public class OrdersController {

	@Autowired
	private OrdersRepository orderRepository;

	/**
	 * 
	 * @param model
	 * @return adminordersdashboard with orders
	 */
	@RequestMapping(value = "/adminorders")

	public String displayOrdersInAdminDashBoard(Model model) {

		List<Orders> listOrd = orderRepository.listOrders(1, 20);
		model.addAttribute("listOrders", listOrd);

		return "adminordersdashboard";

	}

}
