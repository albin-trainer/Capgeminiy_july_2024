package com.cg.collections;
import java.util.ArrayList;
import java.util.Set;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class MapDemo2 {
	static HashMap<String, String> skills= new HashMap<>();
	public static void main(String[] args) {
	//	addEmpData("Raj:Devops");
	addEmpData("Raj", "Devops");
		addEmpData("Nagesh", "Java");
		addEmpData("Krishna", "Devops");
		addEmpData("Sudheer", "Java");
		addEmpData("Dileep", "C++");
		boolean b1=skills.containsValue("Java");
		System.out.println(b1);
		skills.clear();
		skills.containsKey(""); 
		skills.get("");//to read a value by key
		skills.putIfAbsent("", null);
		skills.remove(null, null);//by key and value
		skills.remove(null);//by only key
		
	}
	static List<String> getEmployeesBasedOnSkill(String skill){
		//search by case insensitive
	    ArrayList <String> al = new ArrayList<>();
		Set<Map.Entry<String, String>> r = skills.entrySet();
		for(Map.Entry<String, String> mp : skills.entrySet()) {
			if(mp.getValue().equals(skill)) {
				al.add(mp.getKey());
			}
		}
		return al;
	}
	static void addEmpData(String empName,String skill) {
		skills.put(empName, skill);
	}
	static int countBySkill(String skill) {
		//search by case insensitive
		return 0;
	}
	
}
