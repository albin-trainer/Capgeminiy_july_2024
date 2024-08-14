package com.cg.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

//DAO--> Data access object
//usually the code which interact with DB
public class EmployeeDao {
public static void main(String[] args) {
	Employee e=new Employee(991, 
			"Ayyappa", "Chicago", "ayyapa@gmail.com",
			LocalDate.of(2022, 10,1), "Analyst", 100000);
	
	addNewEmployee(e);
}
static void updateAddress(int eid,String newAddress) {
	
}
static void incrementSalEmpsJoinBeforeDate(float salaryToIncrease,LocalDate date) {
	
}

static void addNewEmployee(Employee e) {
	//how we ll get Connection 
	Connection con=DBConnection.dbConnection();
	String sql="insert into employee values(?,?,?,?,?,?,?)";
	try {
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setInt(1, e.getEid());
		pstmt.setString(2, e.getEmpName());
		pstmt.setString(3, e.getAddress());
		pstmt.setString(4, e.getEmail());
		pstmt.setDate(5, Date.valueOf(e.getDoj()));
		pstmt.setString(6, e.getDesignation());
		pstmt.setFloat(7, e.getSalary());
		int c=pstmt.executeUpdate();//query executed....
		System.out.println("Added a record "+c);
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
}
}
