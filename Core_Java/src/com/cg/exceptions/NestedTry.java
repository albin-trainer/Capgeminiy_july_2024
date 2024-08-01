package com.cg.exceptions;

public class NestedTry {
public static void main(String[] args) {
	String s=callMe();
	System.out.println(s);
}
static String callMe() {
	int arr[]= {1,2,3,4,5};
	try {
		System.out.println("Outer try");
		System.out.println(5/5);
		try {
			System.out.println("Inner try ");
			System.out.println(arr[5]);
		}
		catch(ArithmeticException e) {
			return "1";
		}
		return "2";
	}
	catch(ArrayIndexOutOfBoundsException e) {
		return "3";
	}
}
}
