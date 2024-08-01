package com.cg.lambdas;

public class LambaEx2 {
public static void main(String[] args) {
	Calculator c= (int a, int b) ->{
		return a+b;
	};
	doMaths(c, 99, 1);
	Calculator c2= (a,b) ->a+b;
	
}
static void doMaths(Calculator c, int a,int b) {
	System.out.println(c.add(a, b));
}
}
@FunctionalInterface//wont allow to compile if the interface has more than one abstract or zero methods
interface Calculator{
	int add(int a,int b);
	//void f1();
}
class Addition implements Calculator{

	@Override
	public int add(int a, int b) {
		return a+b;
	}
	
}