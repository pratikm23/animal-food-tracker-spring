package com.tracker.food.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tracker.food.model.ParkSpeciesFoodLink;

@Repository
public interface ParkSpeciesFoodLinkRepository extends JpaRepository<ParkSpeciesFoodLink, Long>{
	
	List<ParkSpeciesFoodLink> findBySpeciesId(int species_id);
	
	List<ParkSpeciesFoodLink> findByParkId(int park_id);
	
	List<ParkSpeciesFoodLink> findByParkIdAndSpeciesId(int park_id, int species_id); 
}
