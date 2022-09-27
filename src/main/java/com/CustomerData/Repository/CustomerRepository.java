package com.CustomerData.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CustomerData.Entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer>{

	Customer findByAge(int age);

	Customer findByName(String name);

}
