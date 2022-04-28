package com.samuel.Admin.Model;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;



public interface AdminRepository extends JpaRepository<Admin,Integer> {

	Optional<Admin> findByname(String uname);
	


}
