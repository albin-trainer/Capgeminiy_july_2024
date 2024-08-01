package com.cg.exceptions;
public class ExceptionEx2 {
public static void main(String[] args) {
	int a=10;
	int b=5;//assume these data given by user @ runtime
	System.out.println("----Welcome-----");
	try {
		int arr[]= {1,2,3,4,5};
		System.out.println(arr[5]);
		int result=a/(b*2-a);//here program terminates abnormally 
		System.out.println("Result : "+result);
		System.out.println("---End try---");
	}
	catch(ArithmeticException e) {
		System.out.println("catch1 ...."+e);
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("catch 2 ...."+e);
	}
	System.out.println("-----Main Ends -------");
}
}






























class A{
	private void hello() {
		
	}
	
}
class B extends A{
	 int hello() {
			return 0;
		}
}











