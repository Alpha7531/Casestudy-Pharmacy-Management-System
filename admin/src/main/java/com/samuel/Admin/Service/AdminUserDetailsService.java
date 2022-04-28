
package com.samuel.Admin.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.samuel.Admin.Model.Admin;
import com.samuel.Admin.Model.AdminRepository;

public class AdminUserDetailsService implements UserDetailsService {

	@Autowired
	private AdminRepository repo;

	@Override
	public UserDetails loadUserByUsername(String username){
// the code will fetch data from database
		Optional<Admin> admin= repo.findByname(username);
		Admin a=admin.orElseThrow(()->new UsernameNotFoundException("User not found"));
		return new AdminUserDetails(a) ;
	}

}
