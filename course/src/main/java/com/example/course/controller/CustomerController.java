package com.example.course.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.course.Repository.CustomerRepository;
import com.example.course.entities.Customer;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerRepository customerRepo;

	@GetMapping("/getAllCustomers")
	public List<Customer> getAllCourses() {
		
		return customerRepo.findAll();
	}
	
	@PostMapping("/saveCustomerDtls")
	public String createcourse(@RequestBody List<Customer> custList) {
		
		customerRepo.saveAll(custList);
		
		return "Saved";
	}
	
}
