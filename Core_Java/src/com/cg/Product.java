package com.cg;
//class names--> pascal case(start with upper case)
public class Product {
//variable name--> camel case(start with lowercase)
	//state/property/instance variable
 int productCode;
 String prodName;
 float price;
 
 //Behaviour/functionality ....
 void discount(int offerCode) {
	 System.out.println("Applying discount");
	 //if offerCode is 1234
	 //logic for 10% discount
	 //else
	  //print invalid offercode
 }
}
