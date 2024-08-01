package com.cg.oops.part4;

public class Laptop extends Product {
private String cpu;

public Laptop(int prodId, String prodName, float price, String cpu) {
	super(prodId, prodName, price);
	this.cpu = cpu;
}

void display() {
	super.display();
	System.out.println("CPU : "+cpu);
}
}
