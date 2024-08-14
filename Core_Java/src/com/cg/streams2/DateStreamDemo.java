package com.cg.streams2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class DateStreamDemo {
public static void main(String[] args) {
	 List<Employee> empList= new ArrayList<>();
	 Employee e1=new Employee(101, "Arjun", "Permanent", 40000,LocalDate.of(2023, 10, 20));
	 Employee e2=new Employee(102, "Bala", "Permanent", 40000,LocalDate.of(2023, 11, 20));
	 Employee e3=new Employee(103, "Karthik","Contract", 35000,LocalDate.of(2023, 9, 2));
	 Employee e4=new Employee(104, "Raj", "Permanent", 50000,LocalDate.of(2024, 1, 20));
	 Employee e5=new Employee(105, "Sanjay", "Contract", 45000,LocalDate.of(2024, 2, 10));
	 empList.add(e1);empList.add(e2);empList.add(e3);empList.add(e4);empList.add(e5);
	 List<Employee> emps=
	findEmployee(empList.stream(),LocalDate.of(2023, 11, 20));
	 System.out.println(emps);
	 findEmpWithDOJDuration(empList.stream(),LocalDate.of(2023, 11, 20),LocalDate.of(2024, 2, 10) );
}
private static void findEmpWithDOJDuration(Stream<Employee> stream, LocalDate fromDate, LocalDate toDate) {
	// TODO Auto-generated method stub
	//
	//fromDate.isAfter() and use toDate.isBefore()
	
}
static  List<Employee> findEmployee(Stream<Employee> stream,LocalDate date){
	return stream.filter(e->e.getDoj().equals(date)).toList();
}

}
