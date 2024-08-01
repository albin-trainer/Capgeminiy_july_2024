package com.cg.streams;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;
public class StreamDemo3 {
public static void main(String[] args) {
	ArrayList<Product> prodList= new ArrayList<>();
	Product p1=new Product(101, "Laptop", 50000, 4.4f);
	Product p2=new Product(102, "Mobile", 20000, 4.7f);
	Product p3=new Product(103, "Ear buds", 2000, 4.5f);
	Product p4=new Product(104, "Mouse", 1000, 4.8f);
	Product p5=new Product(105, "Shoes", 1200, 3.1f);
	prodList.add(p1);prodList.add(p2);prodList.add(p3);prodList.add(p4);prodList.add(p5);
//find top 2 costliest products	
	

	
	Comparator<Product> b= (o1, o2) -> (o1.getPrice()>o2.getPrice())?-1:1;
	
	
	Consumer<Product> we=( p->System.out.println(p.getProdName())); 
	prodList.stream().sorted(b)
	.limit(2).forEach(we);
	
	
	
	
	
	
	
	
	
	
	prodList.stream().
	filter(p->p.getRatings()>=4).
	forEach(p->System.out.println(p.getProdName()));
	//What is Costliest product
	Product maxProd=prodList.stream().
			max(( pr1,  pr2) ->  pr1.getPrice()<pr2.getPrice()?-1:1).get();
	System.out.println("Costliest prod is "+maxProd.getProdName());
	//find the cheapest product
	
	//sort based on price l to h | Hint -->sorted(comparator) in stream 
	
	//sor based on ratings h to l
	
	double totalPrice=prodList.stream().mapToDouble(p->p.getPrice()).sum();
	System.out.println("Ur bill amt is "+totalPrice);
	
	//find the average ratings of all the products
	
}
}
