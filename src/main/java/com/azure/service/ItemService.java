package com.azure.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.azure.entity.BillItem;
import com.azure.repository.ItemRepo;

@Service
public class ItemService {

	@Autowired
	ItemRepo repo;

	public ItemService(ItemRepo repo) {
		super();
		this.repo = repo;
	}
	
	public List<BillItem> getAll(){
		return repo.findAll();
	}
	
	public Optional<BillItem> getItem(int id) {
		return repo.findById(id);
	}
	
	public BillItem addItem(BillItem item) {
		return repo.save(item);
	}
}
