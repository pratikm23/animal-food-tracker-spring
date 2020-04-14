package com.tracker.food.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "food_master")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "parkSpeciesFoodLink"})
public class Food {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;

	@OneToMany(mappedBy = "food")
	private Set<ParkSpeciesFoodLink> parkSpeciesFoodLink = new HashSet<ParkSpeciesFoodLink>();
	
	public Food() {
		super();
	}

	public Food(String name) {
		super();
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<ParkSpeciesFoodLink> getParkSpeciesFoodLink() {
		return parkSpeciesFoodLink;
	}

	public void setParkSpeciesFoodLink(Set<ParkSpeciesFoodLink> parkSpeciesFoodLink) {
		this.parkSpeciesFoodLink = parkSpeciesFoodLink;
	}

	
}
