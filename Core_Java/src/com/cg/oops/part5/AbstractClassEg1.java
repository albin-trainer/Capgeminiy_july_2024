package com.cg.oops.part5;

public class AbstractClassEg1 {
public static void main(String[] args) {
	PerEmp e1=new PerEmp(101, "A", 50000, 5000, 2000);
	ContractEmp e2=new ContractEmp(102,"B", 50000, 10);
	processSal(e1);
	processSal(e2);
}
static void processSal(Employee e) {
	e.calculateSalary();
}
}
