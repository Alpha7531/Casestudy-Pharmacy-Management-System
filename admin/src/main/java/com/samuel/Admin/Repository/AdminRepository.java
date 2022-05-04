package com.samuel.Admin.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.samuel.Admin.Model.AdminModel;



@Repository
public interface AdminRepository extends MongoRepository<AdminModel,String> {
AdminModel findByAdminname(String adminname);
}
