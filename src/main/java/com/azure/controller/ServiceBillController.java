package com.azure.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.azure.entity.ServiceBill;
import com.azure.service.BillService;

@RestController
@RequestMapping("bill")
public class ServiceBillController {

	@Autowired
	private BillService service;
	
	@GetMapping("getAll")
	public List<ServiceBill> getAll(){
		return service.getAll();
	}
	
	@GetMapping("get")
	public Optional<ServiceBill> getBill(int id){
		return service.getBill(id);
	}
	
	@PostMapping("add")
	public ServiceBill addBill(ServiceBill bill) {
		return service.addBill(bill);
	}
	
	
}
