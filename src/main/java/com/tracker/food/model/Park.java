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
@Table(name = "park_master")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "parkSpeciesFoodLink"})
public class Park {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private String city;
	
	private String country;
	
	@OneToMany(mappedBy = "park")
	private Set<ParkSpeciesFoodLink> parkSpeciesFoodLink = new HashSet<ParkSpeciesFoodLink>();
	
	public Park() {
		super();
	}

	public Park(String name, String city, String country) {
		super();
		this.name = name;
		this.city = city;
		this.country = country;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public Set<ParkSpeciesFoodLink> getParkSpeciesFoodLink() {
		return parkSpeciesFoodLink;
	}

	public void setParkSpeciesFoodLink(Set<ParkSpeciesFoodLink> parkSpeciesFoodLink) {
		this.parkSpeciesFoodLink = parkSpeciesFoodLink;
	}
	
	
}
