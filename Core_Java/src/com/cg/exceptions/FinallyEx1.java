package com.cg.exceptions;

public class FinallyEx1 {
public static void main(String[] args) {
	try {
		System.out.println("try");
		System.out.println(5/0);
		System.out.println("End try");
	}
	finally {
		System.out.println("Finally");
	}
	System.out.println("End of main .....");
}
}
