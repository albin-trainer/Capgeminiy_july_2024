package com.cg.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
public class CollectorsDemo {
	static ArrayList<Product> prodList= new ArrayList<>();
public static void main(String[] args) {
	Product p1=new Product(101, "Laptop", 50000, 4.4f);
	Product p2=new Product(102, "Mobile", 20000, 4.7f);
	Product p3=new Product(103, "Ear buds", 2000, 4.5f);
	Product p4=new Product(104, "Mouse", 500, 4.8f);
	Product p5=new Product(105, "Shoes", 1200, 3.1f);
	prodList.add(p1);prodList.add(p2);prodList.add(p3);prodList.add(p4);prodList.add(p5);
	
	
	
Map<String, Float> map=	  findProductByRatingsAndPrice(1000, 4);
 Set<Map.Entry<String, Float>> result=    map.entrySet();
 for(Entry<String, Float> rec:result) {
	 String a=rec.getKey();
	 Float b=rec.getValue();
	 System.out.println(a+"  "+b); 
 }
}
static Map<String, Float> findProductByRatingsAndPrice(float price, float ratings){
	Map<String, Float> map=
	prodList.stream().filter(p->p.getPrice()>price).
	filter(p->p.getRatings()>ratings).
	collect(Collectors.toMap(p->p.getProdName(), p->p.getPrice()));
	return map;
}

static List<String> findProductsPriceLesserThan(float price){
	List<String> list = prodList.stream().
			filter(p->p.getPrice()<price).
			map(p->p.getProdName()).
			collect(Collectors.toList());
	return list;
}
}
