package com.cg.bean;
public class SavingsAccRepImpl  implements AccountRep{
	public SavingsAccRepImpl() {
		System.out.println("SavingsAcc initialized");
	}
	public String credit(float amt) {
		return "The amount of "+amt+" credited in ur salary acc";
	}
}
