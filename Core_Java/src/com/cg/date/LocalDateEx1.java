package com.cg.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class LocalDateEx1 {
public static void main(String[] args) {
	LocalDate currentDate= LocalDate.now();
	System.out.println(currentDate);
	
	LocalDate doj=LocalDate.of(2024, 6, 20);
	
	System.out.println(doj);
	
	Scanner scanner= new Scanner(System.in);
	System.out.println("Enter some date");
	String str=scanner.next();
	
	DateTimeFormatter format=DateTimeFormatter.ofPattern("dd/MM/yyyy");
	LocalDate date=LocalDate.parse(str, format);
	System.out.println(date);
}
}
