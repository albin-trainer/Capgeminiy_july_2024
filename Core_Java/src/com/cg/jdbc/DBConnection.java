package com.cg.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBConnection {
public static void main(String[] args) {
	dbConnection();
}
static Connection dbConnection() {
	Connection con=null;
	String driverClass="com.mysql.cj.jdbc.Driver";
	//http://ipaddress|domainname:portno
	String url="jdbc:mysql://localhost:3307/cg_july_24";
	String uname="root";
	String password="root";
		try {
			//forName()==>loads the class @ runtime in the JVM
			Class.forName(driverClass);
			 con= DriverManager.getConnection(url, uname, password);
			System.out.println("Connected with mysql database");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	//new Emp();
	/*
	 * try { Class.forName("com.cg.jdbc.Emp").newInstance(); } catch
	 * (ClassNotFoundException e) { e.printStackTrace(); } catch
	 * (InstantiationException e) { e.printStackTrace(); } catch
	 * (IllegalAccessException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); }
	 */
}
}

 class Emp{
	public Emp() {
	   System.out.println("Emp class constructor....");
	}
}