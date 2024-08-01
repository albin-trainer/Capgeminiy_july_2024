package com.cg.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo4 {
	//static List<Employee> empList= new ArrayList<>();
public static void main(String[] args) {
	 List<Employee> empList= new ArrayList<>();
Employee e1=new Employee(101, "Arjun", "Permanent", 40000);
Employee e2=new Employee(102, "Bala", "Permanent", 40000);
Employee e3=new Employee(103, "Karthik","Contract", 35000);
Employee e4=new Employee(104, "Raj", "Permanent", 50000);
Employee e5=new Employee(105, "Sanjay", "Contract", 45000);
empList.add(e1);empList.add(e2);empList.add(e3);empList.add(e4);empList.add(e5);
Map<String,List<Employee>> map=makeGroups(empList.stream());
System.out.println(map);
}
//returns Employee obj, throw EmployeeNotFoundException of empid not found
static Employee searchById(List<Employee> emps, int id) {
	Optional<Employee>opt=   emps.stream().filter(e->e.getEid()==id).findFirst();
	if(opt.isEmpty())
		  throw new EmployeeNotFoundException("Employee not found ");
	return opt.get();
}
static long findCount(Stream<Employee> stream,String empType) {
	//count is a function a stream to count all elements
	return 0;
}
//return Stream of Emps
static Stream<Employee> findEmpSalaryMoreThan(Stream<Employee> stream, float salary){
	return null;
}
//return List<Employee>
static List<Employee> findEmployeesSalaryMoreThan(Stream<Employee> stream, float salary){
	return null;
}
//return Map emp id - key , sal -float
static Map<Integer,Float> findEmpMapSalaryMoreThan(Stream<Employee> stream, float salary){
	return null;
}
//return List of emp names sorted by H to L salary and search by empType
static List<String> findEmpsBasedOnTypeAndSort(List<Employee> emps, String empType){
	return null;
}

static List<Employee> findTopEarners(List<Employee>emps, int n){
		emps.stream().
		sorted(null).
		//peek(e->System.out.println(e.getEmpName())).
		limit(n).
		collect(null);
	return null;
}

static Map<String,List<Employee>> makeGroups(Stream<Employee> stream  ){
	Map<String,List<Employee>>  map=  stream.collect(Collectors.groupingBy(e->e.getEmpType()));
	return map;
}
}
