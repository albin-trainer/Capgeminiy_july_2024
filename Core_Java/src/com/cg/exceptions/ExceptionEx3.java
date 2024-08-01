package com.cg.exceptions;

public class ExceptionEx3 {
	static int arr[]= new int[5];
public static void main(String[] args) {
	String s=callMe(10, 5);
	System.out.println(s);
	
}
static String callMe(int a,int b) {
	try {
		arr[0]=10; arr[1]=20;arr[2]=30;
		System.out.println(a/arr[b]);
		return "A";
	}
	catch(ArrayIndexOutOfBoundsException e) {
		return "B";
	}
	catch(ArithmeticException e) {
		return "C";
	}
	//return "D";
}
}
