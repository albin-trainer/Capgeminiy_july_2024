package com.cg;

public class StringDemo2 {
public static void main(String[] args) {
	char ch='A';
	int a=ch;
/*	System.out.println(a);
	System.out.println(ch);
   for(int i=0;i<26;i++)
	  System.out.println(ch++);
   */
	String s1="BANGALORE";
	String s2=change(s1);
	System.out.println(s2);//CBOHBMPSF
	
}
//this method will increment the each char by 1
 static String change(String s) {
	 String c="";
	 for(int i=0;i<s.length();i++) {
		 char ch=s.charAt(i);
		// System.out.println(++ch);
		 c= c+ ++ch;
	 }
	 return c;
 }
}
