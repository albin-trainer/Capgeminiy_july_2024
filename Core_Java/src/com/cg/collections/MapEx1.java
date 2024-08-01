package com.cg.collections;

import java.util.HashMap;

public class MapEx1 {
public static void main(String[] args) {
	HashMap<String, String> map1= new HashMap<>();
	map1.put("CG-10001", "Harry Guru");
	map1.put("CG-10002", "Devaraj");
	map1.put("CG-10003", "Praveen");
	map1.put("CG-10004", "Ranjith");
	System.out.println(map1);
	map1.put("CG-10004", "A Ranjith"); //overwrites
	System.out.println(map1);
	
	String ename=map1.get("CG-10002");
	System.out.println(ename);
}
}
