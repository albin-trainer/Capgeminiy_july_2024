package com.cg.wrapper;

public class WrapperEx1 {
public static void main(String[] args) {
	String s="Hello";
	accept(s);
	accept(99);
	accept(true);
}
//it will accept all type of data 
static void accept(Object obj) {
	System.out.println(obj);
}
}
