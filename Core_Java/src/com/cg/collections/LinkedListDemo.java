package com.cg.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {
public static void main(String[] args) {
	ArrayList<String> list1=new ArrayList<>();
	list1.add("Nagesh");
	list1.add("Raju");
	
	System.out.println(list1);
	
	LinkedList<String> list2=new LinkedList<>();
	list2.add("Dileep");
	list2.add("Harry");
	System.out.println(list2);
	
	list2.addFirst("Jagan");
	list2.addLast("");
	System.out.println(list2);
	list2.removeFirst();
	list2.removeLast();
	String e=list2.getFirst();
	System.out.println(e);
	e=list2.getLast();
	System.out.println(e);
	
	
	
}
}
