package databasetest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class delete {
	
	public static  void  del() {
		try {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id");
		int id=sc.nextInt();
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/pig", "root", "root");
		Statement statement=connection.createStatement();
		
		String query="delete from pig.pig1 where id='"+id+"'";
		statement.executeUpdate(query);
		System.out.println("data deleted ");
	}
		catch(Exception e) {
			System.out.println(e);
			del();
		}

}
}
