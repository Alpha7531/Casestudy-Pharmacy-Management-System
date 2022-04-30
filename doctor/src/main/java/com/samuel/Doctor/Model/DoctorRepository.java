package com.samuel.Doctor.Model;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


public interface DoctorRepository extends JpaRepository<Doctor,Integer> {
	Optional<Doctor> findByname(String uname);
}
