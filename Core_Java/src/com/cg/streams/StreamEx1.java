package com.cg.streams;

import java.util.Arrays;
import java.util.List;

public class StreamEx1 {
public static void main(String[] args) {
	List<Integer> list=
			Arrays.asList(22,34,43,43,34,67,44,67,57,33,88,33,24,67,67,99);
	//filter all odd numbers
	list.stream().
	distinct().
	filter(n->n%2!=0).
	forEach(v->System.out.println(v));
	
	
}
}
