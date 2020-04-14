package com.tracker.food.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tracker.food.model.Food;

public interface FoodRepository extends JpaRepository<Food, Integer>{

}
