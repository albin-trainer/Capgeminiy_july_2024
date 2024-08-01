package com.cg.oops.part4;

public class Product {
private int prodId;
private String prodName;
private float price;

public Product(int prodId, String prodName, float price) {
	this.prodId = prodId;
	this.prodName = prodName;
	this.price = price;
}
void display() {
	System.out.println("Id : "+prodId);
	System.out.println("Product name : "+prodName);
	System.out.println("Price : "+price);
     
}
}
