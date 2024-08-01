package com.cg.collections;
import java.util.ArrayList;
public class ArrayListDemo {
	static ArrayList<String> list= new ArrayList<>();
public static void main(String[] args) {
	String s=addCity("Bangalore");
	System.out.println(s);
	s=addCity("Hyd");
	System.out.println(s);
	s=addCity("Pune");
	System.out.println(s);
	s=addCity("Hyd");
	System.out.println(s);
	displayAll();
	updateCity("Hyd","Hyderabad");
	System.out.println("------------");
	displayAll();
}
static String addCity(String city) {
	  //add city in the list
	//if the city already present just return "already present"
	//else add the city and return "added successfully"	
	if(list.contains(city))
		return "already present";
	else {
		list.add(city);
	}
	return "added successfully";
}
static void displayAll() {
	for(String s:list) {
		System.out.println(s);
	}
}
static void updateCity(String oldCity,String newCity) {
	//returns -1 of oldcity not found 
	int index=list.indexOf(oldCity);
	if(index>=0) {
		list.set(index, newCity);
	}
}
}
