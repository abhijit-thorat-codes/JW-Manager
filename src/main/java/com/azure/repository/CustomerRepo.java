package com.azure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.azure.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
