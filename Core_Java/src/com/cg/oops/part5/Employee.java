package com.cg.oops.part5;
public  abstract class Employee {
private int empId;
private String empName;
public Employee(int empId, String empName) {
	this.empId = empId;
	this.empName = empName;
}
 abstract  void calculateSalary();

void hello() { //concrete methods -- methods having definintion
	System.out.println("Hello  method ....s");
}
}
