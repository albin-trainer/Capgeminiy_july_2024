package com.cg.oops.part6;

public class Q1 {
public static void main(String[] args) {
	new Child();
}
}

class Parent{
	public Parent() {
	    hello();
	}
	private void hello() {
		System.out.println("Hello, i m parent");
	}
}

class Child extends Parent{
	void hello() {
		System.out.println("Hello, i m child");
	}
}
