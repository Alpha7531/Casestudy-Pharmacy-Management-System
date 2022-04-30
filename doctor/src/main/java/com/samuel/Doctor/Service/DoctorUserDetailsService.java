
package com.samuel.Doctor.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.samuel.Doctor.Model.Doctor;
import com.samuel.Doctor.Model.DoctorRepository;

public class DoctorUserDetailsService implements UserDetailsService {

	@Autowired
	private DoctorRepository repo;

	@Override
	public UserDetails loadUserByUsername(String username){
// the code will fetch data from database
		Optional<Doctor> doctor= repo.findByname(username);
		Doctor a=doctor.orElseThrow(()->new UsernameNotFoundException("User not found"));
		return new DoctorUserDetails(a) ;
	}

}
