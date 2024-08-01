package com.cg.oops.part5;

public class ContractEmp extends Employee{
private float chargesPerDay;
private int noOfWorkingDays;
public ContractEmp(int empId, String empName, float chargesPerDay, int noOfWorkingDays) {
	super(empId, empName);
	this.chargesPerDay = chargesPerDay;
	this.noOfWorkingDays = noOfWorkingDays;
}
void calculateSalary() {
	float totalSal=chargesPerDay*noOfWorkingDays;
	System.out.println
	("Contract emp total sal is "
	+totalSal);
}
}
