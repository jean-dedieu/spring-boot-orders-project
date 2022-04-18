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

	/**
	 * shop
	 * 
	 * @param model
	 * @return shop with cars
	 */
	@RequestMapping(value = "/")
	public String shop(Model model) {
		List<ShopCar> listC = carRepository.findAll();
		// listCars sera utilisé pour afficher les données dans la page shop.html
		model.addAttribute("listCars", listC);
		// on retourne la page avec les données
		return "shop";

	}

	/**
	 * 
	 * @param model
	 * @return admincarsdashboard
	 */
	@RequestMapping(value = "/shopadmin")
	public String shopAdmin(Model model) {
		List<ShopCar> listC = carRepository.findAll();
		// listCars sera utilisé pour afficher les données dans la page shop.html
		model.addAttribute("listCars", listC);
		// on retourne la page avec les données
		return "admincarsdashboard";

	}

	/**
	 * add a new car and CRUD cars
	 * 
	 * @param model
	 * @param page
	 * @return addcarsandcrud paginated with add car form and cars table for CRUD
	 */
	@GetMapping(value = "/addcar")
	public String showPage(Model model, @RequestParam(defaultValue = "0") int page) {

		Pageable pageable = PageRequest.of(page, 4);
		model.addAttribute("data", carRepository.findAll(pageable));
		model.addAttribute("currentPage", page);
		model.addAttribute("shopCar", new ShopCar());
		return "addcarsandcrud";

	}

	/**
	 * save a new car
	 * 
	 * @param model
	 * @param shopCar
	 * @return
	 */
	@PostMapping(value = "/save")
	public String saveCar(Model model, ShopCar shopCar) {
		carRepository.save(shopCar);
		return showPage(model, 0);
		// return "addcarsandcrud";
	}

	/**
	 * delete a car
	 * 
	 * @param model
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/delete")
	public String deleteCar(Model model, int id) {
		carRepository.deleteById(id);
		return showPage(model, 0);
	}

}
