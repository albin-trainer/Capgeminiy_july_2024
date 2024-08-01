package com.cg.oops.part3;
public class SuperEx1 {
public static void main(String[] args) {
	new Child();
	new Derive();
}
}
class Parent{
	public Parent() {
		System.out.println("I m Parent constructor");
	}
}
class Child extends Parent{
}
class Base{
	public Base() {
		System.out.println("I m Base constructor");
	}
}
class Derive extends Base{
	public Derive() {
		//super(); 
		System.out.println("I m Derive constructor");
	}
}