package com.cg.oops.part2;

public class ConstructorDemo2 {
public static void main(String[] args) {
	Data d1= new Data();
	System.out.println(d1.x);
	System.out.println(d1.y);
	System.out.println(d1.z);
	System.out.println(d1.n);
}
}


class Data{
	int x;
	float y;
	boolean z;
	String n;
	Data(){
		x=99; y=10.9f; z=true;n="Hello";
	}
}