package com.azure.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.azure.dto.CustomerDto;
import com.azure.entity.Customer;
import com.azure.service.CustomerService;

@RestController
@RequestMapping("customer")
public class CustomerController {
	
	
	@Autowired
	CustomerService service;
	
	@Autowired
	CustomerDto custDto;
	
	public CustomerController(CustomerService cs, CustomerDto cust) {
		this.service = cs;
		this.custDto = cust;
	}
	
	@GetMapping("getAllData")
	public List<Customer> getAllCustomerData() {
		return service.getAllCustomers();
	}
	
	@GetMapping("getCust")
	public List<CustomerDto> getAllCustomers() {
		return service.getOnlyCustomerData();
	}
	
	@PostMapping("add")
	public void addStudent(@RequestBody Customer c) {
		service.addCustomer(c);
	}
	
	@GetMapping("get")
	public Optional<Customer> getCustomer(int id) {
		return service.getCustomer(id);
	}
}

