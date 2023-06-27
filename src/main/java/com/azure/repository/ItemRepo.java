package com.azure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.azure.entity.BillItem;

public interface ItemRepo extends JpaRepository<BillItem, Integer> {

}
