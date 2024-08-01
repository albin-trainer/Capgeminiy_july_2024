package com.cg;
public class EmailCheck {
public static void main(String[] args) {
	String email="albin@xyz.com";
	//must have one and only '@' shud comes in middle
	 //no spl characters
	//two parts 1)uname 2) domain name
	//uname can have dots, numbers, _ in middle  not at start or end
	//domain name must have one and only dot shud be in middle
	boolean isValid=validateEmail(email);
	System.out.println(isValid);
}
static boolean validateEmail(String email) {
	String e[]=  email.split("@");
	System.out.println(e[0]);
	System.out.println(e[1]);
	//either split or substring can be used ...
	String uname= email.substring(0, email.indexOf('@'));
	String domain=email.substring(email.indexOf('@')+1, email.length());
	//use startsWith method
	if(uname.startsWith(".") || uname.startsWith("_") || uname.startsWith("0")) {
		return false;
	}
	if(domain.startsWith(".") || domain.endsWith("."))
		return false;
	return true;
}
}
