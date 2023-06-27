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
@Table(name="JW_CUSTOMER")
@Data
public class Customer {

	public Customer(int id, List<Car> car, String name, LocalDate dob, String phone, String city) {
		super();
		this.id = id;
		this.car = car;
		this.name = name;
		this.dob = dob;
		this.phone = phone;
		this.city = city;
	}

	public Customer() {
		
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", car=" + car + ", name=" + name + ", dob=" + dob + ", phone=" + phone
				+ ", city=" + city + "]";
	}
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="cust_id")
	private int id;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Car> getCar() {
		return car;
	}

	public void setCar(List<Car> car) {
		this.car = car;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@OneToMany(cascade =CascadeType.ALL)
	@JoinColumn(name="fk_cust_id",referencedColumnName="cust_id")
	private List<Car> car;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = true)
	private LocalDate dob;
	
	@Column(nullable = false)
	private String phone;
	
	@Column(nullable = true)
	private String city;
	
}
