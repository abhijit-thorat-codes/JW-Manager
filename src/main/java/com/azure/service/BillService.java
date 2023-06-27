package com.azure.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.azure.entity.ServiceBill;
import com.azure.repository.ServiceBillRepo;

@Service
public class BillService {

	
	@Autowired
	private ServiceBillRepo repo;
	
	public BillService(ServiceBillRepo r) {
		this.repo = r;
	}
	
	@GetMapping("getAll")
	public List<ServiceBill> getAll(){
		return repo.findAll();
	}
	
	@GetMapping("get")
	public Optional<ServiceBill> getBill(int id){
		return repo.findById(id);
	}
	
	@PostMapping("add")
	public ServiceBill addBill(ServiceBill bill) {
		return repo.save(bill);
	}
	
}
