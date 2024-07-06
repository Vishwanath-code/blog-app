package com.ag.model;

import lombok.Data;

@Data
public class LoginRequestModel {
	
	String email;
	String password;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LoginRequestModel(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	public LoginRequestModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
