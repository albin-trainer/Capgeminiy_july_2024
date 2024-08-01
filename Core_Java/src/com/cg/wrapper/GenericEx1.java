package com.cg.wrapper;
//Generics:
/*
 * Parameterized type 
 * no need of typecasting
 * it avoids classcastexception
 */
public class GenericEx1 {
public static void main(String[] args) {
	MyData<Integer> m1= new MyData<>();
	m1.setVal(99);
	MyData<String> m2=new MyData<>();
	m2.setVal("Hello");
	String s1=m2.getVal();//typecasting not req
	int x=m1.getVal();
	System.out.println(s1);
	System.out.println(x);
}
}
class MyData <E>{
	private E val;

	public E getVal() {
		return val;
	}

	public void setVal(E val) {
		this.val = val;
	}
	
	
}