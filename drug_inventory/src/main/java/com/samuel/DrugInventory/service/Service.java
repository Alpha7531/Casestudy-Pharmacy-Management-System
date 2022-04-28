package com.samuel.DrugInventory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.samuel.DrugInventory.AttributeAndRepository.DrugInventory;
import com.samuel.DrugInventory.AttributeAndRepository.DrugInventoryRepository;

@Component
public class Service {
	@Autowired
	private DrugInventoryRepository drugRepo;

	// -----viewing all Drugs in inventory
	public List<DrugInventory> viewAllDrug() {
		return drugRepo.findAll();
	}

	// -----viewing perticular drug data by searching throuh Id
	public DrugInventory viewById(int id) {
		return drugRepo.findById(id).get();
	}
	
	//-----for adding Drug Info
		public void addDrugInfo(DrugInventory drugInventory) {
			drugRepo.save(drugInventory);
		}
//-----------------------------------------------------------------
	//-----For edit and update DrugInventory
		public void updateDrug(DrugInventory drugInventory) {
			drugRepo.save(drugInventory);
		}

	// -----deleting Drug data by searching thougth Id
	public void deleteById( int id) {
		 drugRepo.deleteById(id);
	}

    
     
}
