package com.samuel.DrugInventory.controller;

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

import com.samuel.DrugInventory.AttributeAndRepository.DrugInventory;
import com.samuel.DrugInventory.service.Service;

@RestController
@RequestMapping("/drug")
public class DrugInventoryController {
	

	
	@Autowired
	private Service service;
	
	@GetMapping("/view")
	public List<DrugInventory> viewDrug() {
		return service.viewAllDrug();
	}
	
	@GetMapping("/view/{id}")
	public DrugInventory viewDrug(@PathVariable int id) {
		return  service.viewById(id);
		
	}
	
	@PostMapping("/add")
	public  void addDrugs(@RequestBody DrugInventory drugInventory) {
		service.addDrugInfo(drugInventory);
		
		
	}
	
	@PutMapping("/edit")
	public void editDrug(@RequestBody DrugInventory drugInventory) {
		
		service.updateDrug(drugInventory);
		
	}
	
	@DeleteMapping("/delete/{id}")
	 public void  deleteDrug(@PathVariable int id)
	 { 
		 service.deleteById(id);
	
		
	 }
	

}
