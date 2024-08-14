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
	
	
	String mobileNo="09134567809";//starts with 0 or 91 or +91
	//and 1st digit shud from 6 to 9
	String phoneNoRegex="(0|91|\\+91)?[6-9][0-9]{9}";
	boolean b6=Pattern.matches(phoneNoRegex, mobileNo);
	System.out.println(b6);
	
	String str="SPC01004PM";
	
	String regex1 = "SPC[0-9]{3}(0[0-9]|1[0-2])(AM|PM)";
	
	boolean b7 = Pattern.matches(regex1, str);
	

	if(b7==true) {
		System.out.println(str+" is valid");
	}
	else {
		System.out.println(str+" is not valid");
	}
	
	
	
	
	
	
	
	
}
}
