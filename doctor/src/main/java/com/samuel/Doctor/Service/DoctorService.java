
package com.samuel.Doctor.Service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.samuel.Doctor.Model.DoctorModel;
import com.samuel.Doctor.Repository.DoctorRepository;



@Service
public class DoctorService implements UserDetailsService{

	@Autowired
	private DoctorRepository DoctorRepository;
	
	@Override
	public UserDetails loadUserByUsername(String Doctorname) throws UsernameNotFoundException {
		DoctorModel foundedUser = DoctorRepository.findByDoctorname(Doctorname);
		
		if(foundedUser==null)
			return null;
		String name = foundedUser.getDoctorname();
		String pwd = foundedUser.getPassword();
		return new User(name,pwd,new ArrayList<>());
	
	}
}
