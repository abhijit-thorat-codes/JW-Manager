package com.azure.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.azure.dto.CustomerDto;
import com.azure.entity.Customer;
import com.azure.repository.CustomerRepo;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepo repo;
	
	@Autowired
	private CustomerDto custDto;
	
	public CustomerService(CustomerRepo r,CustomerDto customerDto) {
		this.repo=r;
		this.custDto = customerDto;
	}
	
	public List<Customer> getAllCustomers(){
		return repo.findAll();
	}
	
	public Optional<Customer> getCustomer(int id) {
		return repo.findById(id);
	}
	
	public Customer addCustomer(Customer c) {
		return repo.save(c);
	}

	public List<CustomerDto> getOnlyCustomerData() {
		List<CustomerDto> data = new ArrayList<>();
		for(Customer c:repo.findAll()) {
			data.add(custDto.convertEntity(c));
		}
		return data;
	}
	
	
}
