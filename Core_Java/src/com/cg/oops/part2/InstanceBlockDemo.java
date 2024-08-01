package com.cg.oops.part2;
public class InstanceBlockDemo {
public static void main(String[] args) {
	new Emp1();
	System.out.println("***********");
	new Emp1("xx");
}
}
class Emp1{
	{
		System.out.println("Instance Block 1");
	}
	Emp1(){
		System.out.println("Default Constructor");
	}
	Emp1(String n){
		System.out.println("Parameterized constructor");
	}
	{
		System.out.println("Instance Block 2");
	}
}