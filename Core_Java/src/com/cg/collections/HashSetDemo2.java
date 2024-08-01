package com.cg.collections;

import java.util.HashSet;

public class HashSetDemo2 {
public static void main(String[] args) {
	Employee e1=new Employee(101, "Arun");
	Employee e2=new Employee(102, "Badri");
	Employee e3=new Employee(103, "Chinta");
	Employee e4=new Employee(104, "Dileep");
	Employee e5=new Employee(101, "Arun");
	HashSet<Employee> set= new HashSet<>();
	//hashCode is generated based on memory address
	System.out.println(e1.hashCode());
	System.out.println(e5.hashCode());
	System.out.println(e1.equals(e5));
	set.add(e1);
	set.add(e2);
	set.add(e3);
	set.add(e4);
	set.add(e5);
	System.out.println("No of elements "+set.size());
}
}
