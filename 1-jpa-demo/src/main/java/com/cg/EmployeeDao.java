package com.cg;

import com.cg.entity.Department;
import com.cg.entity.Employee;
import com.cg.entity.Gender;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EmployeeDao {
	static EntityManagerFactory emf=
			Persistence.createEntityManagerFactory("jpaPU");
public static void main(String[] args) {
	System.out.println("TEST");
	addNewDepartment();
}
static void addNewDepartment() {
	Department d= new Department();
	d.setDeptId(902);
	d.setDepartmentName("Accounts");
	EntityManager em=emf.createEntityManager();
	em.getTransaction().begin();
	em.persist(d);
	em.getTransaction().commit();
	System.out.println("Dept added");
}
static void addNewEmp(int deptId) {
	EntityManager em=emf.createEntityManager();
	Department d=em.find(Department.class, deptId);
	if(d!=null) {
		Employee e= new Employee();
		e.setEmpId(111);
		e.setEmpName("Arjun");
		e.setGender(Gender.Male);
		e.setEmail("arun@cg.com");
		e.setDept(d);
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
		System.out.println(" done :) ");
	}
	else
		System.out.println("Dept not found");
}
}
