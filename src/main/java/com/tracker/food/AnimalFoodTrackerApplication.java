package com.tracker.food;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class AnimalFoodTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnimalFoodTrackerApplication.class, args);
	}

}
