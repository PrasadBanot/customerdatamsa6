package com.CustomerData.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CustomerData.Entity.Customer;
import com.CustomerData.Repository.CustomerRepository;


@Service
public class CustomerService {
	@Autowired
	private CustomerRepository repository;
	public Customer saveCustomer(Customer customer) {
		return repository.save(customer);
	}
	public List<Customer> saveCustomer(List<Customer> customers){
		return repository.saveAll(customers);
	}
	public List<Customer> getCustomers(){
		return repository.findAll();
	}
	public Customer getCustomerById(int id) {
		return repository.findById(id).orElse(null);
	}
	public Customer getCustomerByName(String name) {
		return repository.findByName(name);
	}
	public Customer getCustomerByage(int age) {
		return repository.findByAge(age);
	}
	public String deleteCustomer(int id) {
		repository.deleteById(id);
		return "Customer removed sucessfully" + id;
	}
	public Customer updateCustomer(Customer customer) {
		Customer existingCustomer= repository.findById(customer.getId()).orElse(null);
		existingCustomer.setName(customer.getName());
		existingCustomer.setAge(customer.getAge());
		existingCustomer.setGender(customer.getGender());
		return repository.save(existingCustomer);
	}
	
	 
	   
}
