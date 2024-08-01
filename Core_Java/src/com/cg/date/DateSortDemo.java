package com.cg.date;

import java.time.LocalDate;
import java.util.stream.Stream;

public class DateSortDemo {
public static void main(String[] args) {
	Order o1= new Order(1, "USB cable", LocalDate.of(2020, 10, 1));
	Order o2= new Order(2, "Shoes", LocalDate.of(2020, 9, 1));
	Order o3= new Order(3, "Camera", LocalDate.of(2020, 11, 1));
	Order o4= new Order(4, "Bottle", LocalDate.of(2021, 1, 1));
	Order o5= new Order(5, "Ear buds", LocalDate.of(2019, 10, 1));
	Stream.of(o1,o2,o3,o4,o5).
	sorted( (or1,or2)->or1.getOrderDate().compareTo(or2.getOrderDate())).
	limit(3).
	forEach(o->System.out.println(o.getOrderId()+" "+o.getProdName()+" "+o.getOrderDate()));
}
}
