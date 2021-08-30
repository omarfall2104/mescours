package com.saraya;

public class UsrValidation {
	public boolean IsValid(String user, String motDepass) {
		if(user.equalsIgnoreCase("omarfall") && motDepass.equals("2014")) {
			return true;
		}
			return false;
		}
	

}
