package com.samuel.Admin.Model;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface AdminRepository extends MongoRepository<Admin,String> {

}