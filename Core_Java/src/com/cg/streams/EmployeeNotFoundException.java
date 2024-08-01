package com.cg.streams;

public class EmployeeNotFoundException extends RuntimeException {
	EmployeeNotFoundException(String msg){
		super(msg);
	}
}
