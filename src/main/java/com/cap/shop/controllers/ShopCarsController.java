package com.cap.shop.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	@GetMapping(value = "/addcar")
	public String showPage(Model model, @RequestParam(defaultValue = "0") int page) {
		/*
		 * model.addAttribute("data",employeRepository.findAll(new QPageRequest(page,
		 * 2))); fonctionne avec cette dépendance <dependency>
		 * <groupId>com.querydsl</groupId> <artifactId>querydsl-jpa</artifactId>
		 * <version>5.0.0</version> </dependency>
		 */
		// model.addAttribute("data",employeRepository.findAll(new QPageRequest(page,
		// 2)));

		Pageable pageable = PageRequest.of(page, 4);
		model.addAttribute("data", carRepository.findAll(pageable));
		model.addAttribute("currentPage", page);
		model.addAttribute("shopCar", new ShopCar());
		return "addcarsandcrud";

	}
	@PostMapping(value = "/save")
	public String saveCar(Model model,ShopCar shopCar) {
		carRepository.save(shopCar);
		return showPage(model, 0);
		//return "addcarsandcrud";
	}
	
	
	@RequestMapping(value="/delete")
	public String deleteCar(Model model,int id) {
		carRepository.deleteById(id);
		return showPage(model, 0);
	}
	
	

}
