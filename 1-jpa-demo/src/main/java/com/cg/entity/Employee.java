package com.cg.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity//mandatory
@Table(name="EMP")
public class Employee {
	@Id//mandatory
 private int empId;
	@Column(name="ENAME",length = 20)
 private String empName;
	@Column(unique = true)
 private String email;
	@Enumerated(EnumType.STRING)
private Gender gender;
	@ManyToOne
	//if no join col col namd dept_deptId
	@JoinColumn(name="deptId") //FK
	private Department dept;

	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
 
 
}
