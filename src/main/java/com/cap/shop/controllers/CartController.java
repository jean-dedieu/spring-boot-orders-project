package com.cap.shop.controllers;

import java.util.Date;
import java.util.UUID;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cap.shop.dao.ShopCarRepository;
import com.cap.shop.entities.CartItem;
import com.cap.shop.entities.ShoppingCart;
import com.cap.shop.service.ShoppingCartService;

import antlr.StringUtils;

@Controller
public class CartController {
	@Autowired
	private ShopCarRepository carRepository;
	@Autowired
	private ShoppingCartService shoppingCartService;
	
	@PostMapping("addToCart")
	public String addToCart(HttpServletRequest request , Model model, @RequestParam("id") Integer id,
			@RequestParam("quantity") int quantity) {
		    //session Token
		  String sessionToken = (String)request.getSession(true).getAttribute("sessionToken");
		  if(sessionToken == null) {
			  sessionToken =  UUID.randomUUID().toString();
			  request.getSession().setAttribute("sessionToken",sessionToken);
			  shoppingCartService.addShoppingCartFirstTime(id, sessionToken, quantity);
 
		  } else {
			  shoppingCartService.addToExistingShoppingCart(id,sessionToken,quantity);
			  
			  
		  }
		   return "redirect:/";
		
	}

}
