package com.azure.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.azure.entity.BillItem;
import com.azure.entity.ServiceBill;
import com.azure.service.BillService;
import com.azure.service.ItemService;

@RestController
@RequestMapping("item")

public class BillItemController {

	@Autowired
	private ItemService service;

	@Autowired
	private BillService billService;

	
	public BillItemController(ItemService service) {
		super();
		this.service = service;
	}
	
	@GetMapping("getAll")
	public List<BillItem> getAll(){
		return service.getAll();
	}
	
	@GetMapping("get")
	public Optional<BillItem> getItem(int id){
		return service.getItem(id);
	}
	
	@PostMapping("add")
	public BillItem addItem(@RequestBody BillItem item) {
		return service.addItem(item);
	}
	
//	@PutMapping("{item_id}/bill/{bill_id}")
//	public BillItem assignItemToBill(@PathVariable Integer item_id,@PathVariable Integer bill_id) {
//		BillItem item = service.getItem(item_id).get();
//		ServiceBill bill = billService.getBill(bill_id).get();
//		item.addToBill(bill);
//		return service.addItem(item);
//	}
	
}
