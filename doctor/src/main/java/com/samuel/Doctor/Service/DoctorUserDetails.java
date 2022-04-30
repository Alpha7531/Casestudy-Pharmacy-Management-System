
  package com.samuel.Doctor.Service;
  
  import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import
  org.springframework.security.core.userdetails.UserDetails;

import com.samuel.Doctor.Model.Doctor;
  
  public class DoctorUserDetails implements UserDetails {

	  
	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	final private Doctor d;
	
	  
	  
	  
	  
	
	public DoctorUserDetails(Doctor d) {
		
		this.d = d;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		return List.of(()->"read");
	}

	@Override
	public String getPassword() {
		
		return d.getPassword();
	}

	@Override
	public String getUsername() {
		
		return d.getName();
	}

	@Override
	public boolean isAccountNonExpired() {
		
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		
		return true;
	}

	@Override
	public boolean isEnabled() {
				return true;
	}
  

		  
		 
		  
		  }
		 