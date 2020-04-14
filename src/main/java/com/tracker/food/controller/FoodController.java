package com.tracker.food.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tracker.food.model.Food;
import com.tracker.food.repository.FoodRepository;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("api/v1")
public class FoodController {

	@Autowired
	private FoodRepository foodRepository;
	
	@GetMapping("foods")
	public List<Food> getAllFoods() {
		return this.foodRepository.findAll();
	}
	
	@GetMapping("food/{id}")
	public Optional<Food> getFood(@PathVariable("id") int id) {
		return this.foodRepository.findById(id);
	}
}
