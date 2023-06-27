package com.azure.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.azure.dto.CarDto;
import com.azure.entity.Car;
import com.azure.repository.CarRepo;

@Service
public class CarService {

	@Autowired
	private CarRepo repo;
	
	@Autowired
	private CarDto cars;
	
	public CarService(CarRepo r,CarDto c) {
		this.repo=r;
		this.cars=c;
	}
	
	public List<Car> getAllCars(){
		return repo.findAll();
	}
	
	public Optional<Car> getCar(int id) {
		return repo.findById(id);
	}
	
	public Car addCar(Car car) {
		return repo.save(car);
	}

	public List<CarDto> getOnlyCarData() {
		List<CarDto> data =new ArrayList<>();
		for(Car c:repo.findAll())
			data.add(cars.convertEntity(c));
		return data;
	}
	
}
