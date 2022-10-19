package com.java.testemployee2;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	public static Connection getConnection() 
	{
		Connection connection=null;
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	     connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/pig", "root", "root");
		}catch(Exception e) {
			e.printStackTrace();
		}
	 return connection;
	}

}
