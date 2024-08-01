package com.cg.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class IterationDemo1 {
public static void main(String[] args) {
	ArrayList<String> list= new ArrayList<>();
	list.add("Apple");
	list.add("Orange");
	list.add("Banana");
	list.add("Grapes");
	for(String s:list) {
		System.out.println(s);
	}
	//int - Integer, char -Character
	HashMap<String, Float> fruits= new HashMap<>();
	fruits.put("Apple", 200f);
	fruits.put("Orange", 150f);
	fruits.put("Banana", 100f);
	fruits.put("Grapes", 150f);
	float price=fruits.get("Orange");
	System.out.println(price);
	System.out.println("--------------------");
	Set<String> keys=   fruits.keySet();//keySet() --> returns Set view which has only keys
	for(String k:keys) {
		System.out.println(k);
	}
	//values() --> returns Collection view which has only values
	Collection<Float> values=  fruits.values();
	System.out.println("--------------");
	for(Float f:values) {
		System.out.println(f);
	}
	System.out.println("------------------------");
	Set<Map.Entry<String, Float>> records=   fruits.entrySet();
	for(Map.Entry<String, Float> rec:records) {
		String f=rec.getKey();
		float p=rec.getValue();
		System.out.println(f+"  "+p);
	}
}
}
