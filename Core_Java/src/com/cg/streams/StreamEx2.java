package com.cg.streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx2 {
public static void main(String[] args) {
	//returns a new Stream
	Stream.of(1,2,3,4,5,6,7,8,9,10,11,12,12,13,14).
	distinct().
	filter(i->i%2==0).
	forEach(i->System.out.println(i));
	
	
	int s=IntStream.of(1,2,3,4,5,6,7,8,9,10,11,12,12,13,14).
	distinct().
	filter(i->i%2==0).sum();
	System.out.println("Sum of even nos is "+s);
	
	double avg=
	IntStream.of(1,2,3,4,5,6,7,8,9,10,11,12,12,13,14).
	distinct().
	filter(i->i%2==0).average().getAsDouble();
	System.out.println("Average of even nos "+avg);
}
}