package com.cg.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSortDemo1 {
public static void main(String[] args) {
	/*ArrayList<String> list= new ArrayList<>();
	list.add("Mysore");
	list.add("Bangalore");
	list.add("Chennai");
	list.add("Delhi");
	System.out.println(list);
	Collections.sort(list);
	System.out.println(list);*/
	ArrayList<Product> prodList= new ArrayList<>();
	Product p1=new Product(101, "Laptop", 50000, 4.4f);
	Product p2=new Product(102, "Mobile", 20000, 4.7f);
	Product p3=new Product(103, "Ear buds", 2000, 4.5f);
	Product p4=new Product(104, "Mouse", 1000, 4.8f);
	Product p5=new Product(105, "Shoes", 1200, 4.1f);
	prodList.add(p1);
	prodList.add(p2);
	prodList.add(p3);
	prodList.add(p4);
	prodList.add(p5);
	System.out.println("-------------------");
	for(Product p:prodList) {
		System.out.println(p);
	}
	//Collections.sort(prodList);
//	Collections.sort(prodList,new SortByRatings());
	Collections.sort(prodList,null);
	System.out.println("---After sorting---");
	for(Product p:prodList) {
		//internally println invokes toString()
		System.out.println(p);
	}
}
}
