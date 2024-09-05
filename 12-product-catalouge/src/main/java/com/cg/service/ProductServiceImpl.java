package com.cg.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cg.model.Product;
@Component
public class ProductServiceImpl {
public List<Product> allProducts(){
	 Product p1= new Product(101, "Laptop",50000);
	 Product p2= new Product(102, "Mobile",20000);
	 Product p3= new Product(103, "Shoes",2000);
	 Product p4= new Product(104, "Watch",5000);
	 Product p5= new Product(105, "T Shirt",1000);
	 List<Product> plist= new ArrayList<>();
	 plist.add(p1);
	 plist.add(p2);
	 plist.add(p3);
	 plist.add(p4);
	 plist.add(p5);
	 return plist;
 }
}
