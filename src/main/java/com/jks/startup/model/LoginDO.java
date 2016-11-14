package com.jks.startup.model;

public class LoginDO {
	private String name;
	private String password;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name+"--"+this.password;
	}
}
