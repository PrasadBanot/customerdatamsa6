package com.CustomerData.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CustomerData.Entity.Customer;
import com.CustomerData.Service.CustomerService;
@RestController
@RequestMapping("/Cu")
public class CustomerController{
	@Autowired
	private CustomerService service;
	@PostMapping("/customer")
	public Customer addCustomer(@RequestBody Customer customer) {
		return service.saveCustomer(customer);
	}
	@PostMapping("/addCustomers")
	public List<Customer> addCustomers(@RequestBody List<Customer> customers){
		return service.saveCustomer(customers);
	}
	@GetMapping("/Customers")
	public List<Customer> findAllCustomers(){
		return service.getCustomers();
	}
	@GetMapping("/Customers/{id}")
	public Customer findCustomerById(int id) {
		return service.getCustomerById(id);
	}
	@GetMapping("/Customersname/{name}")
	public Customer findCustomerByName(@PathVariable String name) {
		return service.getCustomerByName(name);
	}
	@GetMapping("/Customers/{age}")
	public Customer findCustomerByAge(@PathVariable int age) {
		return service.getCustomerByage(age);
	}
	@PutMapping("/update")
	public Customer updateCustomer(@RequestBody Customer customer) {
		return service.updateCustomer(customer);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteCustomer(@PathVariable int id) {
		return service.deleteCustomer(id);
	}
	
}




