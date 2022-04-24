package com.samuel.Admin.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Supplier-Inventory")
public class SuppInventory {
	
	@Id
	private int id;
	private String name;
	private String email;
	private Long phoneNumber;
	private String drugName;
	private int drugPrice;
	public SuppInventory() {
		super();
	}
	public SuppInventory(int id, String name, String email, Long phoneNumber, String drugName, int drugPrice) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.drugName = drugName;
		this.drugPrice = drugPrice;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getDrugName() {
		return drugName;
	}
	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}
	public int getDrugPrice() {
		return drugPrice;
	}
	public void setDrugPrice(int drugPrice) {
		this.drugPrice = drugPrice;
	}

}
