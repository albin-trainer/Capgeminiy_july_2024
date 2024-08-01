package com.cg.oops.part3;
public class StaticBlockEx1 {
public static void main(String[] args) {
	new Test();
	System.out.println("------------");
	new Test();
}
}
class Test{
	static {
		System.out.println("I m static block1");
	}
	{
		System.out.println("I m instance block1");

	}
	public Test() {
		System.out.println("I m constructor");
	}
}