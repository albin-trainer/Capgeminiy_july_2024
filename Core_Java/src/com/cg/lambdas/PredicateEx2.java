package com.cg.lambdas;

import java.util.ArrayList;
import java.util.function.Predicate;

import com.cg.collections.Product;

public class PredicateEx2 {
public static void main(String[] args) {
	ArrayList<Product> prodList= new ArrayList<>();
	Product p1=new Product(101, "Laptop", 50000, 4.4f);
	Product p2=new Product(102, "Mobile", 20000, 4.7f);
	Product p3=new Product(103, "Ear buds", 2000, 4.5f);
	Product p4=new Product(104, "Mouse", 1000, 4.8f);
	Product p5=new Product(105, "Shoes", 1200, 3.9f);
	prodList.add(p1);
	prodList.add(p2);
	prodList.add(p3);
	prodList.add(p4);
	prodList.add(p5);
	System.out.println("-------------------");
	for(Product p:prodList) {
		System.out.println(p);
	}
	Predicate<Product>pre=(p)->p.getRatings()<4;
	prodList.removeIf(pre);
	
	System.out.println("-------------------");
	for(Product p:prodList) {
		System.out.println(p);
	}
}
}
