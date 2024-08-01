package com.cg.oops.part3;
public class InheritanceDemo {
public static void main(String[] args) {
    Laptop laptop= new Laptop();
	laptop.setProductId(101);
	laptop.setProdName("Lenova");
	laptop.setPrice(50000);
	laptop.setCpu("Intel 11th gen");
	laptop.setRam("16 GB");
	
	Book book=new Book();
	book.setProductId(102);
	book.setProdName("Harru porter");
	book.setPrice(500);
	book.setAuthour("JK Rowlin");
	book.setGenre("fiction");
	
	//call all getter methds
	System.out.println("Prod name :"+laptop.getProdName());
	
	
}
}
