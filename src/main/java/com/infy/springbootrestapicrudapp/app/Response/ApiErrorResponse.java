package com.infy.springbootrestapicrudapp.app.Response;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiErrorResponse {

	private Integer statusCode;
	private String msg;
	private Date date;
	
}
