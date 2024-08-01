package com.cg;
public class ObjectEx1 {
public static void main(String[] args) {
	int x=10;//local variable
	//new -->keyword to allocate memory
	Product p1;
	p1=new Product();
	p1.productCode=101;
	p1.prodName="T Shirt";
	p1.price=999.99f;
	System.out.println("----My Product---");
	/*System.out.println("P code "+p1.productCode);
	System.out.println("Prod Name "+p1.prodName);
	System.out.println("Price : "+p1.price);*/
	display(p1);
	p1.discount(1234);
	System.out.println("----After discount ----");
	System.out.println("Price : "+p1.price);
	Product p2= new Product();
	p2.productCode=102;
	p2.prodName="Mobile";
	p2.price=10000;
	System.out.println("-----");
	display(p2);
	update(p2);
	System.out.println("After update price "+p2.price);
}
  static void display(Product p) {
	  System.out.println("P code "+p.productCode);
	  System.out.println("Prod Name "+p.prodName);
	  System.out.println("Price : "+p.price);
  }
  static void update(Product p) {
	  p.price=p.price+10;
  }
}
