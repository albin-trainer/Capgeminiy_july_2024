package com.cg.entity;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
public class Main {
	static EntityManagerFactory
	emf=Persistence.createEntityManagerFactory("customerPU");
	//reads persistence.xml
public static void main(String[] args) {
	System.out.println("Hello");
	//addCustomer();
	//addEmployee();
	//searchCustomer(101);
	allCustomers();
}
static void allCustomers() {
	EntityManager em=emf.createEntityManager();
	//param --> :paramname
	String jpql="select c from Customer c where c.address = :addr";
	Query q=em.createQuery(jpql);
	q.setParameter("addr","Vizag");//assigning the params
	 List<Customer> customers= q.getResultList();
	 customers.forEach(c->System.out.println(c.getCustName()+" "+c.getAddress()));
	
}
private static void searchCustomer(int cid) {
	EntityManager em=emf.createEntityManager();
	//find()--> to search by PK
	Customer c=em.find(Customer.class, cid);
	if(c!=null) {
		System.out.println(c.getCustName()+" "+c.getAddress()+" "+c.getEmail());
	}
	else {
		System.out.println("Record not found");
	}
}
static void addEmployee() {
	Address addr=new Address();
	addr.setDoorNo("A-119");
	addr.setPlaceName("WhiteField Bangalore");
	Employee e=new Employee();
	e.setId(1);
	e.setEmpName("Ayyappa");
	e.setGender(Gender.Male);
	e.setAddress(addr);
	e.setEmail("ayyappa@cg.com");
	EntityManager em=emf.createEntityManager();
	em.getTransaction().begin();
	em.persist(e);
	em.getTransaction().commit();
	System.out.println("ADDED NEW EMP");
}
static void addCustomer() {
	Customer c= new Customer();
	c.setCustId(101);
	c.setCustName("Shireen");
	c.setAddress("Blore");
	c.setEmail("shireen@cg.com");
	
	EntityManager em=emf.createEntityManager();
	em.getTransaction().begin();
	em.persist(c);//persist in DB
	em.getTransaction().commit();
	System.out.println("ADDED .....");
}
}
