package com.cg.oops.part2;
public class ConstructorDemo1 {
public static void main(String[] args) {
	new Person();
	new Customer();
	//new Student();//ERROR ....
	new Student("Raj");
}
}
class Person{
}
class Customer{
	 Customer(){
		System.out.println("Customer constructor");
	}
}
class Student{
	void Student() {//normal method not a constructor
		
	}
	Student(String name){
		System.out.println(name+" param constructor");
	}
}