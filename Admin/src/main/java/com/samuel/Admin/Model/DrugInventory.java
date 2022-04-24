package com.samuel.Admin.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="DrugInventory")

public class DrugInventory {
	@Id
	private int id;
	private String Drugname;
	private String DrugPrice ;
	
	
	public DrugInventory() {
		super();
	}
	
	public DrugInventory(int id, String Drugname, String DrugPrice) {
		super();
		this.id = id;
		this.Drugname = Drugname;
		this.DrugPrice = DrugPrice;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDrugname() {
		return Drugname;
	}
	public void setDrugname(String Drugname) {
		this.Drugname = Drugname;
	}
	public String getDrugPrice() {
		return DrugPrice;
	}
	public void setDrugPrice(String DrugPrice) {
		this.DrugPrice = DrugPrice;
	}
	
	

}
