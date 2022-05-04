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
@RequestMapping("/admin")
public class Controller {

	@Autowired
	private RestTemplate restTemplate;
//----Crud Operation On DrugInventory microservices------------>>

	/*
	 * Drug details----->findAll----->this will let user to view all the drug
	 * details
	 */
	@GetMapping("/viewAllDrug")
	public List<Object> getAllDrugInventoryInfo() {

		String url = "http://localhost:8084/drug/view";
		Object[] objects = restTemplate.getForObject(url, Object[].class);
		return Arrays.asList(objects);
	}

	/*
	 * Drug details----->findById----->this will let the user to view any perticlar
	 * Drug whose id going to be enter
	 */
	@GetMapping("/viewDrugById")
	public Object getDrugInventoryById(@RequestParam int id) {

		String url = "http://localhost:8084/drug/view/" + id;
		return restTemplate.getForObject(url, Object.class);

	}

	/*
	 * Drug details----->Adding-------> this will let the user to add new Order
	 * details
	 */
	@PostMapping("/addDrugInfo")
	public void addDrugInventoryInfo(@RequestBody DrugInventory drugInventory) {

		restTemplate.postForObject("http://localhost:8084/drug/add", drugInventory, DrugInventory.class);

	}

	/*
	 * Order details----->Updating-------> this will let the user to update old
	 * order details
	 */
	@PutMapping("editDrugInfo")
	public void editDrugInventoryInfo(@RequestBody DrugInventory drugInventory) {
		restTemplate.put("http://localhost:8084/drug/edit", drugInventory);
	}

	/*
	 * Supplier details----->DeleteBYId----->this will let the user to delete any
	 * perticular supplier details who's id is going to be entered
	 */
	@DeleteMapping("/deleteDrugById")
	public String deleteDrugInventoryInfoById(@RequestParam int id) {

		String url = "http://localhost:8084/drug/delete/" + id;
		restTemplate.delete(url);
		return "Data with id '" + id + "' succesfully deleted";
	}

	// ------------Crud Operaton On Supplier Inventory---------->>

	/*
	 * Supplier details----->findAll----->this will let user to view all the
	 * supplier details
	 */
	@GetMapping("/viewAllSupp")
	public List<Object> getAllSuppInventoryInfo() {

		String url = "http://localhost:8085/supplier/view";
		Object[] objects = restTemplate.getForObject(url, Object[].class);
		return Arrays.asList(objects);
	}

	/*
	 * Supplier details----->findById----->this will let the user to view any
	 * perticlar supplier who's id going to be enter
	 */
	@GetMapping("/viewSuppById")
	public Object getSuppInventoryById(@RequestParam int id) {

		String url = "http://localhost:8085/supplier/view/" + id;
		return restTemplate.getForObject(url, Object.class);

	}

	/*
	 * Supplier details----->Adding-------> this will let the user to add new
	 * supplier details
	 */
	@PostMapping("/addSuppInfo")
	public void addSuppInventoryInfo(@RequestBody SuppInventory suppInventory) {

		restTemplate.postForObject("http://localhost:8085/supplier/add", suppInventory, SuppInventory.class);

	}

	/*
	 * Supplier details----->DeleteBYId----->this will let the user to delete any
	 * perticular supplier details who's id is going to be entered
	 */
	@DeleteMapping("/deleteSuppById")
	public String deleteSuppInventoryInfoById(@RequestParam int id) {

		String url = "http://localhost:8085/supplier/delete/" + id;
		restTemplate.delete(url);
		return "Data with id '" + id + "' succesfully deleted";
	}

	// ------------------------------Crud operation on
	// OrderInventory---------------------->>

	/*
	 * Order details-----findeAll----->this will let the user to get all order
	 * details
	 * 
	 * @GetMapping("/viewAllOrder") public List<Object> getAllOrderInfo(){
	 * 
	 * String url="http://localhost:8083/order/view"; Object[] objects=
	 * restTemplate.getForObject(url, Object[].class); return
	 * Arrays.asList(objects); } Order details-----findeById----->this will let the
	 * user to get any perticular order details who's id is going to be entered
	 * 
	 * @GetMapping("/viewOrderById") public Object
	 * getOrderInventoryById(@RequestParam int id){ String
	 * url="http://localhost:8083/order/view/"+id; return
	 * restTemplate.getForObject(url, Object.class); }
	 * 
	 * Order----->DeleteById----->this will let the user to cancel any perticular
	 * order who's id is going to be entered
	 * 
	 * @DeleteMapping("/deleteOrderById") public String
	 * deleteOrderById(@RequestParam int id){
	 * 
	 * String url="http://localhost:8083/order/delete/"+id;
	 * restTemplate.delete(url); return
	 * "Order with id '"+id+"' succesfully canceled"; }
	 */
}
