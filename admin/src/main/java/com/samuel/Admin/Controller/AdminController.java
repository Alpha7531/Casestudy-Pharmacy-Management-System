package com.samuel.Admin.Controller;


import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.samuel.Admin.Model.DrugInventory;
import com.samuel.Admin.Model.SuppInventory;



@RestController
@RequestMapping("/admin/auth")
public class AdminController {
	
	@Autowired
	private RestTemplate restTemplate;
//----Crud Operation On DrugInventory microservices------------>>
	
	@GetMapping("/viewAllDrug")
	public List<Object> getAllDrugInventoryInfo(){
		
		String url="http://localhost:8084/drug/view";
		Object[] objects= restTemplate.getForObject(url, Object[].class);
		return Arrays.asList(objects);
	}
	
	@GetMapping("/viewDrugById")
	public Object getDrugInventoryById(@RequestParam int id){
		
		String url="http://localhost:8084/drug/view/"+id;
		return restTemplate.getForObject(url, Object.class);
		
	}
	
	@PostMapping("/addDrugInfo")
	public void addDrugInventoryInfo(@RequestBody DrugInventory drugInventory ) {
	
		 restTemplate.postForObject("http://localhost:8084/drug/add", drugInventory, DrugInventory.class);
	
	}
	
	@PutMapping("editDrugInfo")
	public void editDrugInventoryInfo(@RequestBody DrugInventory drugInventory) {
		restTemplate.put("http://localhost:8084/drug/edit", drugInventory);
	}
	
	
	@DeleteMapping("/deleteDrugById")
	public String deleteDrugInventoryInfoById(@RequestParam int id){
		
		String url="http://localhost:8084/drug/delete/"+id;
		 restTemplate.delete(url);
		 return "Data with id '"+id+"' succesfully deleted";
	}
	//------------Crud Operaton On Supplier Inventory---------->>
	
	@GetMapping("/viewAllSupp")
	public List<Object> getAllSuppInventoryInfo(){
		
		String url="http://localhost:8085/supplier/view";
		Object[] objects= restTemplate.getForObject(url, Object[].class);
		return Arrays.asList(objects);
	}
	
	@GetMapping("/viewSuppById")
	public Object getSuppInventoryById(@RequestParam int id){
		
		String url="http://localhost:8085/supplier/view/"+id;
		return restTemplate.getForObject(url, Object.class);
		
	}
	
	@PostMapping("/addSuppInfo")
	public void addSuppInventoryInfo(@RequestBody SuppInventory suppInventory ) {
	
		 restTemplate.postForObject("http://localhost:8085/supplier/add", suppInventory, SuppInventory.class);
	
	}
	
	@DeleteMapping("/deleteSuppById")
	public String deleteSuppInventoryInfoById(@RequestParam int id){
		
		String url="http://localhost:8085/supplier/delete/"+id;
		 restTemplate.delete(url);
		 return "Data with id '"+id+"' succesfully deleted";
	}
	
}
