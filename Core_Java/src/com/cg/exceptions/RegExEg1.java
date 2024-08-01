package com.cg.exceptions;

import java.util.regex.Pattern;

public class RegExEg1 {
public static void main(String[] args) {
	String msg="H";
	String regex="[A-Z]";//only one char
	boolean b1=Pattern.matches(regex, msg);
	System.out.println(b1);
	System.out.println("-------------");
	String msg1="HELLO";
	String regex2="[A-Z]{5}";//uppercase with 5 chars
	boolean b2=Pattern.matches(regex2, msg1);
	System.out.println(b2);
	String msg2="Hell9";
	String regex3="[A-Za-z0-9]{5}";//exactly 5 chars
	//	String regex3="[A-Za-z0-9]{5,}";//min 5 chars
//	String regex3="[A-Za-z0-9]{,5}";//max 5 chars
	boolean b3=Pattern.matches(regex3, msg2);
	System.out.println(b3);
	
	String msg3="Helllloooo";
	String regex4="[A-Za-z0-9]+";//1 or more
	boolean b4=Pattern.matches(regex4, msg3);
	System.out.println(b4);
	String email="albin@gmail.com";
	String emailRegEx="[a-zA-Z0-9]+@[a-zA-Z]+\\.[a-zA-Z]{2,5}";
	boolean b5=Pattern.matches(emailRegEx, email);
	System.out.println(b5);
	
	
	
}
}
