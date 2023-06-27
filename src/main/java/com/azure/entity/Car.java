package com.azure.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="JW_CAR")
public class Car {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="car_id",nullable=false)
	private int id;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="fk_car_id",referencedColumnName="car_id")
	private List<ServiceBill> bill;
	
	
	@Column(nullable = false)
	private String model;
	
	@Column(nullable = false)
	private String make;
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Column(nullable = true)
	private LocalDate regYear;
	
	@Column(nullable = false)
	private String fuelType;
	
	@Column(nullable = false)
	private boolean auto;
	
	@Column(nullable = false)
	private long totalKm;
	
	public Car(int id, List<ServiceBill> bill, String model, String make, LocalDate regYear, String fuelType,
			boolean auto, long totalKm, boolean insured) {
		super();
		this.id = id;
		this.bill = bill;
		this.model = model;
		this.make = make;
		this.regYear = regYear;
		this.fuelType = fuelType;
		this.auto = auto;
		this.totalKm = totalKm;
		this.insured = insured;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", bill=" + bill + ", model=" + model + ", make=" + make + ", regYear=" + regYear
				+ ", fuelType=" + fuelType + ", auto=" + auto + ", totalKm=" + totalKm + ", insured=" + insured + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<ServiceBill> getBill() {
		return bill;
	}

	public void setBill(List<ServiceBill> bill) {
		this.bill = bill;
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

	public LocalDate getRegYear() {
		return regYear;
	}

	public void setRegYear(LocalDate regYear) {
		this.regYear = regYear;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public boolean isAuto() {
		return auto;
	}

	public void setAuto(boolean auto) {
		this.auto = auto;
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

	@Column(nullable = true)
	private boolean insured;

	

}
