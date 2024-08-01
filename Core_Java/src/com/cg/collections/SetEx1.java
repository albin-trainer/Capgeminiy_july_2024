package com.cg.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetEx1 {
public static void main(String[] args) {
	//HashSet
	//-never permits duplicates
	//cannot guaranty the order of the elements
	HashSet<String> set1= new HashSet<>();
	set1.add("French fries");
	boolean b1=set1.add("Apple");
	set1.add("Burger");
	set1.add("Puli hora");
	boolean b2=set1.add("Apple");
	System.out.println(set1);
	System.out.println(b1+"  "+b2);
	
	//TreeSet - no duplicates
	          //sorted order
	//uses BST 
	TreeSet<String> set2=new TreeSet<>();
	set2.add("French fries");
	 b1=set2.add("Apple");
	 set2.add("Burger");
	 set2.add("Puli hora");
	 b2=set2.add("Apple");
	System.out.println(set2);
	System.out.println(b1+"  "+b2);
	
	//LinkedHashSet
	 //- no duplicates
	//-elements arranged in insertion order
	LinkedHashSet<String> set3= new LinkedHashSet<>();
	set3.add("French fries");
	 b1=set3.add("Apple");
	 set3.add("Burger");
	 set3.add("Puli hora");
	 b2=set3.add("Apple");
	System.out.println(set3);
	System.out.println(b1+"  "+b2);
}
}
