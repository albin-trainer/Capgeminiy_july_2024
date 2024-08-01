package com.cg.exceptions;

public class FinallyEx2 {
public static void main(String[] args) {
	System.out.println(callMe());
}
static int callMe() {
	try {
		System.out.println("In try");
		System.out.println(5/0);
		return 1;
	}
	catch(Exception e) {
		System.out.println("In catch");
		return 2;
	}
	finally {
		System.out.println("In finally");
		return 3;
	}
}
}
