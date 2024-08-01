package com.cg.oops.part5;
public class PerEmp extends Employee {
private float basicSal;
private float hra;
private float pf;
public PerEmp(int empId, String empName, float basicSal, float hra, float pf) {
	super(empId, empName);
	this.basicSal = basicSal;
	this.hra = hra;
	this.pf = pf;
}
void calculateSalary() {
	float totalSal=basicSal+hra+pf;
	System.out.println("PerEmp total sal is "+totalSal);
}

}
