package com.azure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.azure.entity.ServiceBill;

public interface ServiceBillRepo extends JpaRepository<ServiceBill, Integer> {

}
