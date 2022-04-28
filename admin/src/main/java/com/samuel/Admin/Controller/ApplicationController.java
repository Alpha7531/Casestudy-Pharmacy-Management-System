/*
 * package com.samuel.Admin.Controller;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder; import
 * org.springframework.web.bind.annotation.PostMapping; import
 * org.springframework.web.bind.annotation.RequestBody; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * import com.samuel.Admin.Model.Admin; import
 * com.samuel.Admin.Model.AdminRepository;
 * 
 * @RestController
 * 
 * @RequestMapping("/login/auth") public class ApplicationController {
 * 
 * @Autowired private BCryptPasswordEncoder passwordEncoder;
 * 
 * @Autowired private AdminRepository adminRepo;
 * 
 * 
 * @PostMapping("/admin/auth") public String addUser(@RequestBody Admin admin) {
 * 
 * String pwd=admin.getPassword(); String
 * encryptedPwd=passwordEncoder.encode(pwd); admin.setPassword(encryptedPwd);
 * adminRepo.save(admin); return "Registered Sucessfully";
 * 
 * } }
 */