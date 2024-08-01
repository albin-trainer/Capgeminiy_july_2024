package com.cg.oops.part6;

public class Q3 {
public static void main(String[] args) {
	SuperClass s=new SubClass();
	System.out.println(s.a);
}
}

class SuperClass{
	int a=getA();
	int b=9;
	//int a=getA();

	int getA() {
		return b+9;
	}
}
class SubClass extends SuperClass{
	int getA() {
		return b+5;
	}
}