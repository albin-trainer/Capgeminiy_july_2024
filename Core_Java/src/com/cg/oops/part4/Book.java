package com.cg.oops.part4;

public class Book extends Product{
private String authour;
private String genre;
public Book(int prodId, String prodName, float price, String authour, String genre) {
	super(prodId, prodName, price);
	this.authour = authour;
	this.genre = genre;
}

void display() {
	super.display();
	System.out.println("Authour : "+authour);
	System.out.println("Genre "+genre);
}
}
