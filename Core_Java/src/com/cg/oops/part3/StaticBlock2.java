package com.cg.oops.part3;
public class StaticBlock2 {
	static {
		System.out.println("Hello i m static block");
	}
public static void main(String[] args) {
	System.out.println("Main method ....");
	new C();   new C();
}
}
class P{
	static {
		System.out.println("static block1");
	}
	{
		System.out.println("instance block1");
	}
	public P() {
		System.out.println("constructor 1");
	}
}
class C extends P{
	static {
		System.out.println("static block2");
		}
		{
		System.out.println("instance block2");
		}
	public C() {
		System.out.println("constructor 2");
	}
}