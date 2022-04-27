package com.samuel.Admin.Model;




import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="Admin")
public class Admin {
	@Id
	@GeneratedValue
   private int id;
   private String name;
   private String email;
   private Long phoneNumber;
   private String password;
   
public Admin(int id, String name, String email, Long phoneNumber, String password) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.phoneNumber = phoneNumber;
	this.password = password;
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


public String getPassword() {
	return password;
}


public void setPassword(String password) {
	this.password = password;
}
}
