package com.samuel.SupplierInventory.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.samuel.SupplierInventory.Model.SuppInvenRepository;
import com.samuel.SupplierInventory.Model.SuppInventory;

@Component
public class Service {

	@Autowired
	private SuppInvenRepository SuppRepo;
	
	// -----viewing all supplier info in inventory
		public List<SuppInventory> viewAllSupplier() {
			return SuppRepo.findAll();
		}
	
		// -----viewing perticular supplier information by searching throuh Id
		public SuppInventory viewById(int id) {
			return SuppRepo.findById(id).get();
		}
		
		//-----for adding supplier Info
		public void addDrugInfo(SuppInventory SuppInventory) {
			SuppRepo.save(SuppInventory);
		}
		// -----deleting Drug data by searching thougth Id
		public void deleteById( int id) {
			 SuppRepo.deleteById(id);
		}
}
