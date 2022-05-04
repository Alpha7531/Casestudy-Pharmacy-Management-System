package com.samuel.DrugInventory.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.samuel.DrugInventory.Model.DrugInventory;

public interface DrugInventoryRepository extends MongoRepository<DrugInventory,Integer> {




} 
