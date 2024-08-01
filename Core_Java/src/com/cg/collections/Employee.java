package com.cg.collections;

import java.util.Objects;

public class Employee {
private int empId;
private String empName;
public Employee() {
	// TODO Auto-generated constructor stub
}



@Override
public int hashCode() {
	return Objects.hash(empId, empName);
}



@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	return empId == other.empId && Objects.equals(empName, other.empName);
}



public Employee(int empId, String empName) {
	super();
	this.empId = empId;
	this.empName = empName;
}

public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}

}
