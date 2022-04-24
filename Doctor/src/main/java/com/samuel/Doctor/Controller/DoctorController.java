package com.samuel.Doctor.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/viewAllDrug")
	public List<Object> getAllDrugInventoryInfo(){
		
		String url="http://localhost:8084/drug/view";
		Object[] objects= restTemplate.getForObject(url, Object[].class);
		return Arrays.asList(objects);
	}
	@GetMapping("/viewDrugbyId")
	public Object getDrugInventoryById(@RequestParam int id){
		
		String url="http://localhost:8084/drug/view/"+id;
		return restTemplate.getForObject(url, Object.class);
		
	}
}
