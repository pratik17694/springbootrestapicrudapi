package com.infy.springbootrestapicrudapp.app.Response;

public class UserNotFound extends RuntimeException{

	public UserNotFound(String message) {
		
		super(message);
	}
}
