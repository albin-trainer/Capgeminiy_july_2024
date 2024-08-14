package com.cg.exceptions;

import java.util.Scanner;
public class ThrowEx1 {
public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);
	System.out.println("Enter the amt to debit");
	float amtToDebit=scanner.nextFloat();
}
static String transaction(float amtToDebit) {
	float balanceAmt=5000;
	if(amtToDebit>balanceAmt)
		try {
			throw new InSufficientFundsException();
		} catch (InSufficientFundsException e) {
			return "InSufficient Funds";
		}
	else {
		balanceAmt=balanceAmt-amtToDebit;
		System.out.println("Transaction Success");
		System.out.println("Balance amt is "+balanceAmt);
		return "Transaction Success";
	}
}
}
