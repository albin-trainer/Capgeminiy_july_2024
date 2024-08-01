package com.cg.oops.part3;
public class OverridingEx1 {
public static void main(String[] args) {
	Parent1 p1=new Parent1();
	p1.f1();
	
	p1=new Child1();
	p1.f1();
	//Parent1 p2= new Child1();
	//p2.f1();
	//p2.f2(); Error .....
}
}
class Parent1{
	void f1() {
		System.out.println("I m Parent f1 method");
	}
}
class Child1 extends Parent1{
	void f1() {
		System.out.println("I m Child f1 method");
	}
	void f2() {
		System.out.println("I m Child f2 method");
	}
}