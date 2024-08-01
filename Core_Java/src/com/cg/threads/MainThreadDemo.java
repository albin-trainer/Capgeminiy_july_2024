package com.cg.threads;

public class MainThreadDemo {
public static void main(String[] args) {
	System.out.println("Hello");
	//System.out.println(5/0);
	Thread t=Thread.currentThread();//returns current running thread ....
	System.out.println("Current running thread is "+t.getName());
	t.setName("Ayyappa");
	System.out.println("Current running thread is "+t.getName());
	//System.out.println(5/0);
}
}
