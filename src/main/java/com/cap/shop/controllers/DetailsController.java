package com.cap.shop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cap.shop.dao.ShopCarRepository;
import com.cap.shop.entities.ShopCar;


@Controller
public class DetailsController {
	@Autowired
	private ShopCarRepository carRepository ;

	@GetMapping("/detail/{id}")
	public String showIndex(@PathVariable("id") Integer id, Model model) {
		ShopCar car = carRepository.findShopCarById(id);
		model.addAttribute("car", car);
		return "details";
	}

}
