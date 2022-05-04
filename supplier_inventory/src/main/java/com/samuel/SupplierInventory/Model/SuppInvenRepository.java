package com.samuel.SupplierInventory.Model;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface SuppInvenRepository extends MongoRepository<SuppInventory,Integer>  {

}
