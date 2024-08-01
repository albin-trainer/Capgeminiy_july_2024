package com.cgexceptions;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ThrowExceptionDemo {
public static void main(String[] args) {
	//user has to input name:email
	//Eg. sudheer:sudheer@gmail.com
	//if the email is invalid throw a InvalidEmailException
	//with the msg Please Enter Valid Mail Id 
	//and return it
	String input="sudheer:sudheer@gmailcom";
	String inp[]=input.split(":");
	String email=inp[1];
	String r=validateEmail(email);
	System.out.println(r);
}
static String validateEmail(String email) {
	String emailRegEx="[a-zA-Z0-9]+@[a-zA-Z]+\\.[a-zA-Z]{2,5}";
	if(Pattern.matches(emailRegEx, email)) {
		return "Valid Email";
	}
	else {
		try {
			throw new InvalidEmailException("Please Enter Valid Mail Id");
		} catch (Exception e) {
			return "Invalid Email";
		}
	}
	//return null;
}
}

class InvalidEmailException extends RuntimeException{
	public InvalidEmailException() {
	}
	public InvalidEmailException(String msg) {
		super(msg);
	}
}