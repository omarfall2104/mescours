package com.saraya;

public class Validation {
	
	public boolean userValidation (String username, String password) {
		if(username.equals("omarfall") && password.equals("2104")) {
			return true;
		}
		else {
			return false;
		}
	} 
}
