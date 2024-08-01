package com.cg.oops.part1;

public class ProductArrayEx1 {
public static void main(String[] args) {
	//<type> variable[]= new <type>[size]
	int nums[]= new int[5];
	nums[0]=9;
	nums[1]=80;
	System.out.println(nums[0]);
	System.out.println(nums[1]);
	System.out.println(nums[2]);
	System.out.println(nums[3]);
	System.out.println("------------");
	//loop --> execute the same stmt multiple times
	for(int i=0;i<nums.length;i++) {
		System.out.println(nums[i]);
	}
	System.out.println("-----for each-------");
	for(int val:nums) {
		System.out.println(val);
	}
	Product myCart[]= new Product[3];
	
	Product p1= new Product();
	p1.setProductId(101);
	p1.setProductName("Shirt");
	p1.setPrice(1500);
	
	Product p2= new Product();
	p2.setProductId(102);
	p2.setProductName("Mobile");
	p2.setPrice(15000);
	
	Product p3= new Product();
	p3.setProductId(103);
	p3.setProductName("Shampoo");
	p3.setPrice(5);
	myCart[0]=p1;
	myCart[1]=p2;
	myCart[2]=p3;
	//iterate by for loop/for each
	//& print the data 
	for(Product p:myCart) {
		System.out.println(p.getProductName()+
				" price is "+p.getPrice()+
				" id is "+p.getProductId());
		//findTotalCost(null);
	}
}

//find the total cost of all the products in the cart
   float findTotalCost(Product cart[]) {
	  return 0;
  }
  static Product findCostliestProduct(Product cart[]) {
	  return null;
  }
  static Product findCheapestProduct(Product cart[]) {
	  return null;
  }
}
