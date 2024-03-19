package com.naveen.logic;

public class LoginValidateLogic {
	
	public boolean loginUser(String userName, String password) {
		// ideally to be connected with DB 
		return userName.equals("sapient") && password.equals("india"); 
	}
}
