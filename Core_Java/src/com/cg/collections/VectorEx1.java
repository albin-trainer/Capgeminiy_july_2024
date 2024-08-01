package com.cg.collections;

import java.util.Vector;

public class VectorEx1 {
public static void main(String[] args) {
	//provides a dynamic array . default size is 10
	Vector<String> v1 = new Vector<String>();
	System.out.println("initial capacity is "+v1.capacity());
	
	Vector<String> v2= new Vector<>(4);
	System.out.println("capacity "+v2.capacity());
	v2.add("Bangalore");
	v2.add("Mysore");
	v2.add("Chennai");
	System.out.println("No of elements is "+v2.size());
	System.out.println(v2);
	v2.add("Hyderabad");
	//it creates a another array with double 
	//the capacity and copy elements from old to new array
	v2.add("Tirupati");
	System.out.println(v2);
	System.out.println(v2.capacity());
	System.out.println(v2.size());
	System.out.println(v2.get(0));
	System.out.println(v2.contains("Hyderabad"));
	v2.set(0, "Bengaluru");// to modify a element by index
	System.out.println(v2);
	
}
}
