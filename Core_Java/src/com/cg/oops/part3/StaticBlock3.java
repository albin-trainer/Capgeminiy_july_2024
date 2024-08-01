package com.cg.oops.part3;

public class StaticBlock3 {
public static void main(String[] args) {
	System.out.println("Main ...");
	Test2.hello();
}
}


class Test2{
	static{
		System.out.println("static block on test2 class");
	}
	static void hello() {
		System.out.println("Hello method");
	}
}