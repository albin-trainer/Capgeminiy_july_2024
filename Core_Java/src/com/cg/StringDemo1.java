package com.cg;

public class StringDemo1 {

	public static void main(String[] args) {
		String s1="Hello Good morning";
		int index=s1.indexOf('o'); //to get the index of a char
		System.out.println(index);
		index=s1.indexOf('o', 5);
		System.out.println(index);
		char ch=s1.charAt(9);//to get the char of a index
		
		System.out.println(ch);
		for(int i=0;i<s1.length();i++) {
			System.out.println(s1.charAt(i));
		}
	}

}
