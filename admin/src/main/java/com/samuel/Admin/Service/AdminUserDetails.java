
  package com.samuel.Admin.Service;
  
  import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import
  org.springframework.security.core.userdetails.UserDetails;

import com.samuel.Admin.Model.Admin;
  
  public class AdminUserDetails implements UserDetails {

	  
	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	final private Admin a;
	
	  
	  
	  
	  
	
	public AdminUserDetails(Admin a) {
		
		this.a = a;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		return List.of(()->"read");
	}

	@Override
	public String getPassword() {
		
		return a.getPassword();
	}

	@Override
	public String getUsername() {
		
		return a.getName();
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
		 