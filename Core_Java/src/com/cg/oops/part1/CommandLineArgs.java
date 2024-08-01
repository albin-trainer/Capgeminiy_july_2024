package com.cg.oops.part1;

public class CommandLineArgs {
public static void main(String[] args) {
	int arr[]= {};//empty array
	System.out.println("Hello");
	System.out.println(args[0]);
	for(String s:args) {
		System.out.println(s);
	}
}
}
