package com.samuel.Doctor.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection="doctor")
public class DoctorModel {

	@Id

	private int id;
	private String doctorname;
	private String emailid;
	private String contactno;
	private String password;
	
	@Override
	public String toString() {
		return "DoctorModel [id=" + id + ", doctorname=" + doctorname + ", email=" + emailid + ", contactno=" + contactno
				+ ", password=" + password + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDoctorname() {
		return doctorname;
	}

	public void setDoctorname(String doctorname) {
		this.doctorname = doctorname;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno2) {
		this.contactno = contactno2;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	



	
	
	

}
