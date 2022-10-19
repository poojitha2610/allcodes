package com.java.testemployee2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Employeeservice implements Employeedao  {

	public ArrayList<Employee> displayEmployee(Employee employee) 
	{
		ArrayList<Employee>arrayList=new ArrayList<Employee>();
		try {
		
		Connection con =ConnectionFactory.getConnection();
		Statement statement=con.createStatement();
		ResultSet  rset=statement.executeQuery("SELECT * FROM pig.employeekit");
		while(rset.next()) {
		  Employee emp=new Employee();
		  System.out.println(rset.getString(1));
		  emp.setName(rset.getString(1));
		  emp.setPassword(rset.getString(2));
		  arrayList.add(emp);
		  //System.out.println(arrayList);
		}
		
	}catch(Exception e) {
		e.printStackTrace();
	}
		return arrayList;
	}

	public void addEmployee(Employee employee) {
		//ArrayList<Employee>arrayList=new ArrayList<Employee>();
		try {
			
			Connection con =ConnectionFactory.getConnection();
			Statement statement=con.createStatement();
		    String query="insert into pig.employeekit(`name`,`passsword`) values('"+employee.getName()+"','"+employee.getPassword() +"')";
		    statement.executeUpdate(query);
			System.out.println("data inserted successfully");
			
		}catch(Exception e) {
			e.printStackTrace();
	}
	}
	public void updateEmployee(String u) {
		try {
   		Connection con =ConnectionFactory.getConnection();
		Statement statement=con.createStatement();
		statement.executeUpdate(u);
		ResultSet  rset=statement.executeQuery("SELECT * FROM pig.employeekit");
		
		}catch(Exception e) {
			e.printStackTrace();
	}
	}

	public void deEmployee(Employee employee) {                                                                      
		try {
		Connection con =ConnectionFactory.getConnection();
		Statement statement=con.createStatement();
	   String query="DELETE FROM `pig`.`employeekit` WHERE (`name` ='"+employee.getName()+"' )";
	   		
	   statement.executeUpdate(query);
		System.out.println("data delete successfully");
		}catch(Exception e) {
			e.printStackTrace();
	}	
	}

	
}
