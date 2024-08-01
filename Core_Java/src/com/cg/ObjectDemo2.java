package com.cg;
public class ObjectDemo2 {
	public static void main(String[] args) {
Account a1= new Account();
Account a2= new Account();
a1.setAccNumber(1234);
a1.setBankBalance(10000);
a1.setCustomerName("Hari");

a2.setAccNumber(6789);
a2.setBankBalance(4000);
a2.setCustomerName("Dileep");
//store data in both accounts
fundTransfer(a1, a2, 500);
//print the balance of both accounts
System.out.println(a1.getCustomerName()+" balance is "+a1.getBankBalance());
System.out.println(a2.getCustomerName()+" balance is "+a2.getBankBalance());
	}
	 static void fundTransfer(Account acc1,Account acc2, float transferAmt){
       // logic goes here 
		 float b1=acc1.getBankBalance();
		 acc1.setBankBalance(b1-transferAmt);
		 float b2=acc2.getBankBalance();
		 acc2.setBankBalance(b2+transferAmt);
		 //chk the condition that acc1 hav enough balance
		// acc1.bankBalance=acc1.bankBalance-transferAmt;
		// acc2.bankBalance=acc2.bankBalance+transferAmt;
		 
    }
}
