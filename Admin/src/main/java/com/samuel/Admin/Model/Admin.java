package com.samuel.Admin.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Admin")
public class Admin {
	@Id
    private int id;
   private String name;
   private String email;
   private Long phoneNumber;
   
public Admin() {
	super();
}

public Admin(int id, String name, String email, Long phoneNumber) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.phoneNumber = phoneNumber;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Long getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(Long phoneNumber) {
	this.phoneNumber = phoneNumber;
}
   
   
}
