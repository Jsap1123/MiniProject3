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

import com.cogent.boot.entity.Plans;
import com.cogent.boot.repo.PlansRepo;

@RestController
@RequestMapping("/api/plans")
public class PlansController {
	@Autowired
	PlansRepo plansRepo;
	
	@GetMapping("/getplans")
	List<Plans> getAllPlans() {
		return plansRepo.findAll();
	}
	@PostMapping("/addplans")
	Plans newPlans(@RequestBody Plans plans) {
		return plansRepo.save(plans);
	}
	@DeleteMapping("/deleteplans/{id}")
	public String deletePlans(@PathVariable("id") Long id) {
		try {
			plansRepo.deleteById(id);
			return "Deletion was successful";
		}
		catch (Exception e) {
			e.printStackTrace();
			return "Deletion was unsuccessful";
		}
	}
}
