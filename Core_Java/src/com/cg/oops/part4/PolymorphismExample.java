package com.cg.oops.part4;

public class PolymorphismExample {
public static void main(String[] args) {
	Laptop laptop= new Laptop(101, "HP laptop", 50000, "Intel");
	Book book= new Book(102, "Guru", 500, "JK Rowlin", "Fantancy");
	Product[] myCart= {laptop,book};
	System.out.println("----My Cart----");
	for(Product p:myCart) {
		p.display();
		System.out.println("************");
	}
}
}
