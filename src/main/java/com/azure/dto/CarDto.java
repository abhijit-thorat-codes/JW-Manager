package com.azure.dto;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import com.azure.entity.Car;

import lombok.Data;

@Data
@Component
public class CarDto {
	
	private int id;
	private String model;
	private String make;
	private int regYear;
	private boolean auto;
	private String fuelType;
	private long totalKm;
	private boolean insured;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int getRegYear() {
		return regYear;
	}
	public void setRegYear(int regYear) {
		this.regYear = regYear;
	}
	public boolean isAuto() {
		return auto;
	}
	public void setAuto(boolean auto) {
		this.auto = auto;
	}
	public CarDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public long getTotalKm() {
		return totalKm;
	}
	public void setTotalKm(long totalKm) {
		this.totalKm = totalKm;
	}
	public boolean isInsured() {
		return insured;
	}
	public void setInsured(boolean insured) {
		this.insured = insured;
	}
	public CarDto(int id, String model, String make, int regYear, boolean auto, String fuelType, long totalKm,
			boolean insured) {
		super();
		this.id = id;
		this.model = model;
		this.make = make;
		this.regYear = regYear;
		this.auto = auto;
		this.fuelType = fuelType;
		this.totalKm = totalKm;
		this.insured = insured;
	}
	
	public CarDto(int id2, String model2, String make2, LocalDate regYear2, boolean auto2, String fuelType2,
			long totalKm2, boolean insured2) {
		// TODO Auto-generated constructor stub
	}
	public CarDto convertEntity(Car c) {
		// TODO Auto-generated method stub
		return new CarDto(c.getId(),c.getModel(),c.getMake(),c.getRegYear().getYear(),c.isAuto(),c.getFuelType(),c.getTotalKm(),c.isInsured());
	}
	
	

}
