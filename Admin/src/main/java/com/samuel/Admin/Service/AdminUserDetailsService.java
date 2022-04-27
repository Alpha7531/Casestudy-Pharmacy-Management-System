/*
 * package com.samuel.Admin.Service;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.security.core.userdetails.UserDetails; import
 * org.springframework.security.core.userdetails.UserDetailsService; import
 * org.springframework.security.core.userdetails.UsernameNotFoundException;
 * 
 * import com.samuel.Admin.Model.Admin; import
 * com.samuel.Admin.Model.AdminRepository;
 * 
 * public class AdminUserDetailsService implements UserDetailsService {
 * 
 * @Autowired private AdminRepository repo;
 * 
 * @Override public UserDetails loadUserByUsername(String name) throws
 * UsernameNotFoundException { Admin user=repo.findByUsername(name);
 * 
 * AdminDetails adminDetails = null; if(user !=null) { adminDetails= new
 * AdminDetails(); adminDetails.setAdmin(user); } else { throw new
 * UsernameNotFoundException("User not exits with the name"+ name); }
 * 
 * return adminDetails; }
 * 
 * 
 * 
 * 
 * }
 */
