package com.cg.exceptions;

public class ExceptionEx1 {
public static void main(String[] args) {
	int a=10;
	int b=5;//assume these data given by user @ runtime
	System.out.println("----Welcome-----");
	int result=a/(b*2-a);//here program terminates abnormally 
	
	System.out.println("Result : "+result);
	System.out.println("-----Main Ends -------");
}
}
