package com.tracker.food.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tracker.food.model.Park;
import com.tracker.food.repository.ParkRepository;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/v1")
public class ParkController {

	@Autowired
	private ParkRepository parkRepository;
	
	@GetMapping("parks")
	public List<Park> getAllParks() {
		return this.parkRepository.findAll();
	}
	
	
}
