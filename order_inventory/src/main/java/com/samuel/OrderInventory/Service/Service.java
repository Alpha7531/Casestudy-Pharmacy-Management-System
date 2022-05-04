package com.samuel.OrderInventory.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.samuel.OrderInventory.Model.Order;
import com.samuel.OrderInventory.Model.OrderRepository;

@Component
public class Service {
	@Autowired
	private OrderRepository Repo;

	// -----viewing all Order in Database
	public List<Order> viewAllDrug() {
		return Repo.findAll();
	}

	// -----viewing perticular order by id
	public Order viewById(int id) {
		return Repo.findById(id).get();
	}
	
	//-----for adding Order 
		public void addDrugInfo(Order order) {
			Repo.save(order);
		}

	// -----deleting order data by searching thougth Id
	public void deleteById( int id) {
		 Repo.deleteById(id);
	}

    
     
}
