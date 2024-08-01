package com.cg.exceptions;

import java.util.Scanner;
public class ThrowEx1 {
public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);
	float balanceAmt=5000;
	System.out.println("Enter the amt to debit");
	float amtToDebit=scanner.nextFloat();
	if(amtToDebit>balanceAmt)
	//	throw new RuntimeException();
		throw new InSufficientFundsException();
	else {
		balanceAmt=balanceAmt-amtToDebit;
		System.out.println("Transaction Success");
		System.out.println("Balance amt is "+balanceAmt);
	}
}
}
