package com.tracker.food.model;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@Table(name = "park_species_food")
public class ParkSpeciesFoodLink {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "link_id")
	private long id;
	

    @ManyToOne(cascade = {CascadeType.MERGE})
    @JoinColumn(name = "park_id")
	private Park park;
	
    @ManyToOne(cascade = {CascadeType.MERGE})
    @JoinColumn(name = "species_id")
	private Species species;
	
    @ManyToOne(cascade = {CascadeType.MERGE})
    @JoinColumn(name = "food_id")
	private Food food;
	
	private int food_quantity;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
	private Timestamp time;
	
	private int species_quantity;
	
	public ParkSpeciesFoodLink() {
		super();
	}

	public ParkSpeciesFoodLink(Park park, Species species, Food food, int food_quantity) {
		super();
		this.park = park;
		this.species = species;
		this.food = food;
		this.food_quantity = food_quantity;
	}

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Park getPark() {
		return park;
	}

	public void setPark(Park park) {
		this.park = park;
	}

	public Species getSpecies() {
		return species;
	}

	public void setSpecies(Species species) {
		this.species = species;
	}

	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	public int getFood_quantity() {
		return food_quantity;
	}

	public void setFood_quantity(int food_quantity) {
		this.food_quantity = food_quantity;
	}

	public Timestamp getTime() {
		return time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}

	public int getSpecies_quantity() {
		return species_quantity;
	}

	public void setSpecies_quantity(int species_quantity) {
		this.species_quantity = species_quantity;
	}
	
}
