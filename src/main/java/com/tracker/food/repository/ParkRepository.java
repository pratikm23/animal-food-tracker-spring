package com.tracker.food.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tracker.food.model.Park;

@Repository
public interface ParkRepository extends JpaRepository<Park, Integer>{

}
