package com.samuel.OrderInventory.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.samuel.OrderInventory.Model.Order;
import com.samuel.OrderInventory.Service.Service;

@RestController
@RequestMapping("/order")
public class OrderController {
	@Autowired
	private Service service;
	
	@GetMapping("/view")
	public List<Order> viewDrug() {
		return service.viewAllDrug();
	}
	
	@GetMapping("/view/{id}")
	public Order viewDrug(@PathVariable int id) {
		return  service.viewById(id);
		
	}
	
	@PostMapping("/add")
	public  void addDrugs(@RequestBody Order drugInventory) {
		service.addDrugInfo(drugInventory);
		
		
	}
	@DeleteMapping("/delete/{id}")
	 public void  deleteDrug(@PathVariable int id)
	 { 
		 service.deleteById(id);
		
	
		
	 }
}
