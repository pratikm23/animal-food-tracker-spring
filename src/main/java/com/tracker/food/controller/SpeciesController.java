package com.tracker.food.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tracker.food.model.Species;
import com.tracker.food.repository.SpeciesRepository;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("api/v1")
public class SpeciesController {

	@Autowired
	private SpeciesRepository speciesRepository;
	
	@GetMapping("species")
	public List<Species> getAllSpecies() {
		return this.speciesRepository.findAll();
	}
	
	@GetMapping("species/{id}")
	public Optional<Species> getSpecies(@PathVariable("id") int id) {
		return this.speciesRepository.findById(id);
	}
}
