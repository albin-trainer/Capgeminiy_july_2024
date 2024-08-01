package com.cg.exceptions;

public class ThrowsEx1 {
public static void main(String[] args) {
System.out.println("Main ");	
try {
	callMe1();
} catch (Exception e) {
	System.out.println("In catch");
}
}

static void callMe1() throws Exception{
	System.out.println("call me 1");
	callMe2();
	
}
static void callMe2()  throws Exception{
	System.out.println("call me 2");
	throw new Exception();
}


}
