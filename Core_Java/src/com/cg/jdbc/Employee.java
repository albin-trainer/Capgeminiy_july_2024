package com.cg.jdbc;

import java.time.LocalDate;

public class Employee {
private int eid;
private String empName;
private String address;
private String email;
private LocalDate doj;
private String designation;
private float salary;

public Employee() {
	// TODO Auto-generated constructor stub
}

public Employee(int eid, String empName, String address, String email, LocalDate doj, String designation,
		float salary) {
	super();
	this.eid = eid;
	this.empName = empName;
	this.address = address;
	this.email = email;
	this.doj = doj;
	this.designation = designation;
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

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public LocalDate getDoj() {
	return doj;
}

public void setDoj(LocalDate doj) {
	this.doj = doj;
}

public String getDesignation() {
	return designation;
}

public void setDesignation(String designation) {
	this.designation = designation;
}

public float getSalary() {
	return salary;
}

public void setSalary(float salary) {
	this.salary = salary;
}

@Override
public String toString() {
	return "Employee [eid=" + eid + ", empName=" + empName + ", address=" + address + ", email=" + email + ", doj="
			+ doj + ", designation=" + designation + ", salary=" + salary + "]";
}

}
