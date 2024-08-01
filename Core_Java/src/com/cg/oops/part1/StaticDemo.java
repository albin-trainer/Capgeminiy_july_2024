package com.cg.oops.part1;
public class StaticDemo {
public static void main(String[] args) {
	Account.setRoi(4.5f); //common for all accs
	Account a1=new Account();
	a1.setAccNo(10001);
	a1.setCustName("Devraj");
	a1.setBalance(100000);
	System.out.println("Name is "+ a1.getCustName()+
			" and balance is "+a1.getBalance()+
			" with roi "+a1.getRoi());
	Account a2= new Account();
	a2.setAccNo(10002);
	a2.setCustName("Praveen");
	a2.setBalance(1);
	System.out.println("Name is "+ a2.getCustName()+
			" and balance is "+a2.getBalance()+
			" with roi "+a2.getRoi());
	a1.setRoi(5);
	System.out.println(a2.getRoi());
}
}
