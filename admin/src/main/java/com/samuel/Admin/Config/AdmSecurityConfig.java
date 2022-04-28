
package com.samuel.Admin.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.samuel.Admin.Service.AdminUserDetailsService;

@Configuration

public class AdmSecurityConfig extends WebSecurityConfigurerAdapter {
@Bean
public UserDetailsService userDetailService() {
	return new AdminUserDetailsService();
}
	
@Bean 
public PasswordEncoder passwordEncoder() {
	return NoOpPasswordEncoder.getInstance();
}
//	@Bean
//	public BCryptPasswordEncoder encodePwd() {
//		return new BCryptPasswordEncoder();
//	}

}
