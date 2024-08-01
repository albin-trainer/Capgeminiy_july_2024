package com.cg;

public class StringDemo4 {
public static void main(String[] args) {
	String s1="Hello";
	
	//it create a new String & return it 
	String s2=s1.concat("Good evening");
	System.out.println(s1);
	System.out.println(s2);
	String s3="Hello";
	System.out.println(s1==s3); //chks memory not content
	
	String s4=new String("Hello");
	System.out.println(s1==s4);	
	System.out.println(s1.equals(s4));//chks content
}
}
