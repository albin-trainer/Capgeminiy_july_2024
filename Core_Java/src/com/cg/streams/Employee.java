package com.cg.streams;

import java.util.Objects;

public class Employee {
private int eid;
private String empName;
private String empType;
private float salary;
public Employee() {
	// TODO Auto-generated constructor stub
}


public Employee(int eid, String empName, String empType, float salary) {
	super();
	this.eid = eid;
	this.empName = empName;
	this.empType = empType;
	this.salary = salary;
}


public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getEmpType() {
	return empType;
}
public void setEmpType(String empType) {
	this.empType = empType;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}


@Override
public String toString() {
	return "Employee [eid=" + eid + ", empName=" + empName + ", empType=" + empType + ", salary=" + salary + "]";
}

}
