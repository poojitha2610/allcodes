package databasetest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.cj.xdevapi.Statement;
public class dbtest {
	public static void display()
	{
		
		try {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver found ");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/pig", "root", "root");
		System.out.println("1");
		java.sql.Statement statement=connection.createStatement();
		System.out.println("@");
		ResultSet set=statement.executeQuery("select * from pig1");
		System.out.println("2");
		while(set.next()) {
			System.out.println("3"+set.getString(2)+  "        marks "+ "   "+set.getString(3)+"  "+set.getString(4)+"  "+set.getString(5));
		}
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	}
