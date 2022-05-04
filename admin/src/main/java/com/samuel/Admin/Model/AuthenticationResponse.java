package com.samuel.Admin.Model;

public class AuthenticationResponse {

	public AuthenticationResponse(String response) {
		this.response = response;
		
	}

	private String response;

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}
}