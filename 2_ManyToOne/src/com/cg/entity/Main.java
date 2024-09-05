package com.cg.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class Main {
	static EntityManagerFactory
	emf=Persistence.createEntityManagerFactory("ManyToOnePU");
	//reads persistence.xml
public static void main(String[] args) {
	System.out.println("TEST");
	//addNewBank();
	addNewCustomer("HDFC1234");
//	searchCustomersByBank("SBI090");
}
private static void searchCustomersByBank(String ifscCode) {
	//use jpql
	//find customers based on ifscCode 
	String jqpl="select c from Customer c where c.bank.ifscCode = :ifsc";
	
}
static void addNewBank() {
	//impl add new bank
	 Bank bank=new Bank();
	 bank.setIfscCode("HDFC1234");
	 bank.setBranch("WhiteField, Bangalore");
	 bank.setBankName("HDFC");
	 EntityManager em=emf.createEntityManager();
	 em.getTransaction().begin();
	 em.persist(bank);
	 em.getTransaction().commit();
	 System.out.println("New bank added....");
	 
 }

static void credit(float amt,int cid) {
	//Assume cid is the acc no 
	 EntityManager em=emf.createEntityManager();
	 Customer c=em.find(Customer.class, cid);
	 if(c!=null) {
		 em.getTransaction().begin();
		 c.setBankBalance(c.getBankBalance()+amt);
		 em.getTransaction().commit();
		 System.out.println("updated ....");
	 }
	 else
		 System.out.println("invalid cust od ");
}
 static void addNewCustomer(String bankIfscCode) {
	 EntityManager em=emf.createEntityManager();
	 Bank bank=em.find(Bank.class, bankIfscCode);
	 if(bank!=null) {
		 Customer c=new Customer();
		 c.setCid(10006);
		 c.setCustName("Hemant");
		 c.setBankBalance(15000);
		 c.setBank(bank);
		 em.getTransaction().begin();
		 em.persist(c);
		 c.setBankBalance(16000);
		 em.getTransaction().commit();
		 System.out.println("New Customer added....");
	 }
	 else
		 System.out.println("Bank not found");
	 
 }
}
