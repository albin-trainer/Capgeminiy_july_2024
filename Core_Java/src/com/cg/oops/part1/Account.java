package com.cg.oops.part1;
public class Account {
private int accNo;
private String custName;
private float balance;
private static float roi;
public int getAccNo() {
	return accNo;
}
public void setAccNo(int accNo) {
	this.accNo = accNo;
}
public String getCustName() {
	return custName;
}
public void setCustName(String custName) {
	this.custName = custName;
}
public float getBalance() {
	return balance;
}
public void setBalance(float balance) {
	this.balance = balance;
}
public static float getRoi() {
	return roi;
}
public static void setRoi(float roi) {
	Account.roi = roi;
}

}
