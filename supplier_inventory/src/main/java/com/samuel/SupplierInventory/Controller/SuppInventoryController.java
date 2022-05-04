package com.samuel.SupplierInventory.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.samuel.SupplierInventory.Model.SuppInventory;
import com.samuel.SupplierInventory.Service.Service;

@RestController
@RequestMapping("/supplier")
public class SuppInventoryController {
	
	@Autowired
	private Service service;
	
	
	@GetMapping("/view")
	public List<SuppInventory> viewSupp() {
		return service.viewAllSupplier();
	}
	
	@GetMapping("/view/{id}")
	public SuppInventory viewSuppById(@PathVariable int id) {
		return  service.viewById(id);
		
	}
	
	@PostMapping("/add")
	public  void addSupp(@RequestBody SuppInventory suppInventory) {
		service.addDrugInfo(suppInventory);
		
		
	}
	@DeleteMapping("/delete/{id}")
	 public void  deleteSupp(@PathVariable int id)
	 { 
		 service.deleteById(id);
	
		
	 }
	
}

