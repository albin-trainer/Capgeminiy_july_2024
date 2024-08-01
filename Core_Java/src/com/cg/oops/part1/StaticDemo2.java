package com.cg.oops.part1;

public class StaticDemo2 {
	int x=10; //instance variables, access via obj
	static int y=99;
public static void main(String[] args) {
	//System.out.println(x);
	System.out.println(y);
	//f1();
	StaticDemo2 s= new StaticDemo2();
	System.out.println(s.x);
	s.f1();
}

void f1() {
	System.out.println("f1 method ....");
}
}
