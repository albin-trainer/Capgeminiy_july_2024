package com.cg.oops.part3;
public class SuperWithParamsEx1 {
public static void main(String[] args) {
Emp e1=	new Emp("Sudheer","Blr","CG");
e1.displayPerson();
e1.displayEmp();
}
}
class Person{
	private String name;
	private String address;
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
	void displayPerson() {
		System.out.println("Name is "+name);
		System.out.println("Address is "+address);
	}
}

class Emp extends Person{
	private String work;
	public Emp(String name, String address, String work) {
		super(name, address);
		this.work = work;
	}
	void displayEmp() {
		System.out.println("Work in "+work);
	}
	
}