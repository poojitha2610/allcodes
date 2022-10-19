package com.java.testjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
public class testdb1 {

	public static void main(String[] args) {
		ArrayList<Employee>arrayList =new  ArrayList<>();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/pig", "root", "root");
			Statement statement=connection.createStatement();
			ResultSet set=statement.executeQuery("SELECT * FROM employ");
			while(set.next()){//for(;set.next();)
				Employee employee=new  Employee();
				employee.setId(set.getInt(1));
				employee.setName(set.getString(2));
				employee.setZip(set.getInt(3));
				arrayList.add(employee);
			}
			for (Employee e:arrayList ) {
				System.out.println(e.getId()+" "+e.getName()+" "+e.getZip());
			}
			for (Employee e:arrayList ) {
				System.out.println(e);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		

	}

}
