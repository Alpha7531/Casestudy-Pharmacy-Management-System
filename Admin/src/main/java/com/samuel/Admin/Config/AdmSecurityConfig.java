/*
 * package com.samuel.Admin.Config;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.security.config.annotation.authentication.builders.
 * AuthenticationManagerBuilder; import
 * org.springframework.security.config.annotation.method.configuration.
 * EnableGlobalMethodSecurity; import
 * org.springframework.security.config.annotation.web.builders.HttpSecurity;
 * import org.springframework.security.config.annotation.web.configuration.
 * EnableWebSecurity; import
 * org.springframework.security.config.annotation.web.configuration.
 * WebSecurityConfigurerAdapter; import
 * org.springframework.security.core.userdetails.UserDetailsService; import
 * org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
 * 
 * @Configuration
 * 
 * @EnableWebSecurity
 * 
 * @EnableGlobalMethodSecurity(prePostEnabled = true) public class
 * AdmSecurityConfig extends WebSecurityConfigurerAdapter{
 * 
 * @Autowired private UserDetailsService userDS;
 * 
 * @Override protected void configure(AuthenticationManagerBuilder auth) throws
 * Exception { auth.userDetailsService(userDS).passwordEncoder(encodePwd());
 * //calling password encoder super.configure(auth); }
 * 
 * //spring security for url
 * 
 * @Override protected void configure(HttpSecurity http) throws Exception {
 * http.csrf().disable(); http.authorizeHttpRequests()
 * .antMatchers("/admin/**   ").authenticated() .anyRequest() .permitAll()
 * .and() .formLogin(); super.configure(http); }
 * 
 * @Bean public BCryptPasswordEncoder encodePwd() { return new
 * BCryptPasswordEncoder(); }
 * 
 * }
 */