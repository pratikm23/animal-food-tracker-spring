package com.tracker.food.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tracker.food.model.Species;

@Repository
public interface SpeciesRepository extends JpaRepository<Species, Integer> {

}
