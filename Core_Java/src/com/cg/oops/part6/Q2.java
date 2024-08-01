package com.cg.oops.part6;
public class Q2 {
public static void main(String[] args) {
Base base= new Derive();
base.f2(); base.f1();
}
}

class Base{
	static void f1() {
		System.out.println("I m static f1 frm Parent");
	}
	void f2() {
		System.out.println("I m f2 frm Parent");

	}
}
class Derive extends Base{
	static void f1() {
		System.out.println("I m static f1 frm Child");
	}
	void f2() {
		System.out.println("I m f2 frm Child");

	}
}
