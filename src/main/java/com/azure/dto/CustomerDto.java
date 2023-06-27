package com.azure.dto;

import org.springframework.stereotype.Component;

import com.azure.entity.Customer;

import lombok.Data;

@Data
@Component
public class CustomerDto {
	
	private int id;
	private String name;
	private String city;
	private String phone;	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public CustomerDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	public CustomerDto(int id, String name, String city, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.phone = phone;
	}
	
	
	public CustomerDto convertEntity(Customer c) {
			return new CustomerDto(c.getId(),c.getName(),c.getCity(),c.getPhone());
		
	}
	
//	public static CustomerDto getInstance() {
//		if()
//	}
	
	
}
