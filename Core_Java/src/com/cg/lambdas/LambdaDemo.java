package com.cg.lambdas;

public class LambdaDemo {
public static void main(String[] args) {
	 Fun f=(String name) -> name +" doing fun";
	 ;
	String s= f.doFun("Nagesh");
	System.out.println(s);
}
}


interface Fun{
	String doFun(String name);
}