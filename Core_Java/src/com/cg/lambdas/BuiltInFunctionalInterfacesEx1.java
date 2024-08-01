package com.cg.lambdas;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class BuiltInFunctionalInterfacesEx1 {
public static void main(String[] args) {
	ArrayList<Integer> list= new ArrayList<>();
	list.add(100);
	list.add(110);
	list.add(99);
	list.add(17);
	list.add(183);
	list.add(190);
	list.add(100);
	System.out.println(list);
	
	Predicate<Integer> predicate=n->n<100;
	list.removeIf(predicate);
	//list.removeIf(n->n>=100);
	
	System.out.println(list);
	//we can iterate by traditional for loop or Enhanced for loop(for each)
	for(int v:list) { //for java 1.5
		System.out.println(v);
	}
	System.out.println("--------------------");
	
	//Consumer<Integer> c= (Integer v)->System.out.println(v);
	//list.forEach(c);
	list.forEach(v->System.out.println(v));
}
}

/*
 * class ConsumerImpl implements Consumer<Integer>{
 * 
 * public void accept(Integer t) { System.out.println(t); }
 * 
 * }
 */