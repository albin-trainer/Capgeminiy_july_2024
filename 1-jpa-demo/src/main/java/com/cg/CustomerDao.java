package com.cg;

import java.util.List;

import com.cg.entity.Customer;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class CustomerDao {
	static EntityManagerFactory emf=
	Persistence.createEntityManagerFactory("jpaPU");//reads persistence.xml
public static void main(String[] args) {
	System.out.println("test");
	//addNewCustomer();
	//searchCustomer(108);
	//allCustomers();
	changeAddress(105, "Chennai");
}
static void allCustomers() {
	EntityManager em=emf.createEntityManager();
	//jpql --> querying objects NOT tables
	String jpql="select c from Customer c";
	Query q=em.createQuery(jpql);
	List<Customer> clist=   q.getResultList();
	clist.forEach(c->System.out.println(c.getCustName()+"\t"+c.getAddress()));
} 

static void searchByAddress(String address) {
	EntityManager em=emf.createEntityManager();
	//jpql --> querying objects NOT tables
	String jpql="select c from Customer c where c.address = :addr";
	Query q=em.createQuery(jpql);
	q.setParameter("addr", address);
	List<Customer> clist=   q.getResultList();
	clist.forEach(c->System.out.println(c.getCustName()+"\t"+c.getAddress()));
} 
static void searchCustomer(int cid) {
	EntityManager em=emf.createEntityManager();
	Customer c=  em.find(Customer.class, cid);
	if(c!=null) {
		System.out.println(c.getCustName()+"  "+c.getAddress());
	}
	else {
		System.out.println("Customer not found ..");
	}
}
static void addNewCustomer() {
	Customer c1=new Customer(); //means a new record/row in table
	c1.setCid(105);
	c1.setCustName("Arun");
	c1.setAddress("Chennai");
	EntityManager em=emf.createEntityManager();
	em.getTransaction().begin();
			em.persist(c1);
	c1.setAddress("Mysore");
	em.getTransaction().commit();
	System.out.println("new customer added :)");
}
static void changeAddress(int cid,String newAddress) {
	EntityManager em=emf.createEntityManager();
	em.getTransaction().begin();
	Customer c=em.find(Customer.class, cid); //reading the existing customer
	if(c!=null) {
		c.setAddress(newAddress); //update the obj
		em.getTransaction().commit();//commit
		System.out.println("updated...");
	}
	else {
		System.out.println("Customer not found ...");
	}
}
}
