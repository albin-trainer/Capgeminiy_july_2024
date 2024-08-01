package com.cg.collections;

import java.util.HashMap;
import java.util.Map;

public class MapSumDemo {
public static void main(String[] args) {
	HashMap<Integer, String> map= new HashMap<>();
	map.put(10, "A");
	map.put(20, "B");
	map.put(11, "B");
	map.put(5, "A");
	map.put(9, "A");
	int c=findSum(map, "A");
	System.out.println(c);//24
	
}
//find the sum of keys based on values 
static int findSum(Map<Integer,String> map, String str) {
	return 0;
}
}
