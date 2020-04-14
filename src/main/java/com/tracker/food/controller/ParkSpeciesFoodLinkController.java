package com.tracker.food.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tracker.food.model.ParkSpeciesFoodLink;
import com.tracker.food.repository.ParkSpeciesFoodLinkRepository;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/v1")
public class ParkSpeciesFoodLinkController {
	 
	@Autowired
	private ParkSpeciesFoodLinkRepository meals;
	
	@GetMapping("meals")
	public List<ParkSpeciesFoodLink> getAllLinks() {
		return this.meals.findAll();
	}
	
	@GetMapping("meals/species/{id}")
	public List<ParkSpeciesFoodLink> getMealsBySpeciesId(@PathVariable("id") int id) {
		return this.meals.findBySpeciesId(id);
	}
	
	@GetMapping("meals/park/{id}")
	public List<ParkSpeciesFoodLink> getMealsByParkId(@PathVariable("id") int id) {
		return this.meals.findByParkId(id);
	}
	
	@GetMapping("meals/park/{parkid}/species/{speciesid}")
	public List<ParkSpeciesFoodLink> getMealsByParkAndSpeciesId(
			@PathVariable("parkid") int parkId,
			@PathVariable("speciesid") int speciesId) {
		return this.meals.findByParkIdAndSpeciesId(parkId, speciesId);
	}
	
	@PostMapping("save/meal")
	public ParkSpeciesFoodLink createMeal(@RequestBody ParkSpeciesFoodLink meal) {
		return this.meals.save(meal);
	}
}
