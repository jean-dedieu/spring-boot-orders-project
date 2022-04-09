package com.cap.shop.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cap.shop.dao.ShopCarRepository;
import com.cap.shop.entities.ShopCar;


@Controller
public class ShopCarsController {
	@Autowired
	ShopCarRepository carRepository;
	@RequestMapping(value = "/")
	public String shop(Model model) {
		List<ShopCar> listC = carRepository.findAll();
		// listCars sera utilisé pour afficher les données dans la page shop.html
		model.addAttribute("listCars", listC);
		// on retourne la page avec les données
		return "shop";
		
	}
	
	@RequestMapping(value = "/shopadmin")
	public String shopAdmin(Model model) {
		List<ShopCar> listC = carRepository.findAll();
		// listCars sera utilisé pour afficher les données dans la page shop.html
		model.addAttribute("listCars", listC);
		// on retourne la page avec les données
		return "admincarsdashboard";
		
	}
	
	

}
