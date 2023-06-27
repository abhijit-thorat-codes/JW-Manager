package com.azure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.azure.entity.Car;

public interface CarRepo extends JpaRepository<Car, Integer> {

}
