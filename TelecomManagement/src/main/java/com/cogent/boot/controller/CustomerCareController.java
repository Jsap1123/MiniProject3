package com.cogent.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.boot.entity.CustomerCare;
import com.cogent.boot.repo.CustomerCareRepo;

@RestController
@RequestMapping("/api/customercare")
public class CustomerCareController {
	@Autowired
	CustomerCareRepo ccRepo;
	
	@GetMapping("/getcustomercare")
	List<CustomerCare> getCustomerCare() {
		return ccRepo.findAll();
	}
	
	@PostMapping("/addcustomercare")
	CustomerCare newCustomerCare(@RequestBody CustomerCare customerCare) {
		return ccRepo.save(customerCare);
	}
	@DeleteMapping("/deletecustomercare/{id}")
	public String deleteCustomerCare(@PathVariable("id") Long id) {
		try {
			ccRepo.deleteById(id);
			return "Deletion was successful";
		}
		catch (Exception e) {
			e.printStackTrace();
			return "Deletion was unsuccessful";
		}
	}
}
