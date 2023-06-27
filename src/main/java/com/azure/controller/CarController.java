package com.azure.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.azure.dto.CarDto;
import com.azure.entity.Car;
import com.azure.service.CarService;

@RestController
@RequestMapping("car")
public class CarController {

	@Autowired
	CarService service;
	
	public CarController(CarService s) {
		this.service = s;
	}
	
	@GetMapping("getAll")
	public List<Car> getAllCarData(){
		return service.getAllCars();
	}

	@GetMapping("getCars")
	public List<CarDto> getOnlyCarData(){
		return service.getOnlyCarData();
	}
	
	@GetMapping("getCar")
	public Optional<Car> getCar(int id) {
		return service.getCar(id);
	}
	
	@PostMapping("add")
	public Car addCar(@RequestBody Car car) {
		System.out.println(car.toString());
		return service.addCar(car);
	}
	
	
	
	
}
