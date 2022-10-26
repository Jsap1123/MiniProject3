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

import com.cogent.boot.entity.Purchase;
import com.cogent.boot.repo.PurchaseRepo;

@RestController
@RequestMapping("/api/purchase")
public class PurchaseController {
	@Autowired
	PurchaseRepo purchaseRepo;
	
	@PostMapping("/addpurchase")
	Purchase newPurchase(@RequestBody Purchase purchase) {
		return purchaseRepo.save(purchase);
	}
	
	@GetMapping("/getpurchase")
	List<Purchase> getAllPurchases() {
		return purchaseRepo.findAll();
	}
	
	@DeleteMapping("/deletepurchase/{id}")
	public String deletePurchase(@PathVariable("id") Long id) {
		try {
			purchaseRepo.deleteById(id);
			return "Purchase was Deleted";
		}
		catch (Exception e) {
			e.printStackTrace();
			return "No purchase found";
		}
		
	}
	
}
