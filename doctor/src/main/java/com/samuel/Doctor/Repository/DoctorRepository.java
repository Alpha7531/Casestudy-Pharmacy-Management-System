package com.samuel.Doctor.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.samuel.Doctor.Model.DoctorModel;

public interface DoctorRepository extends MongoRepository<DoctorModel,String> {
	DoctorModel findByDoctorname(String doctorname);
}
