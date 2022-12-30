package com.infy.springbootrestapicrudapp.app.restException;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.infy.springbootrestapicrudapp.app.Response.ApiErrorResponse;
import com.infy.springbootrestapicrudapp.app.Response.UserNotFound;

@RestControllerAdvice
public class ErrorHandler {

	@ExceptionHandler(value = UserNotFound.class)
	public ResponseEntity<ApiErrorResponse> handleUserNotFound()
	{
		ApiErrorResponse apiErrorResponse= new ApiErrorResponse(404, "User Not Found", new Date());
		
		return new ResponseEntity<ApiErrorResponse>(apiErrorResponse,HttpStatus.NOT_FOUND);
		
	}
}
