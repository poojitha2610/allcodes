package databasetest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

import com.mysql.cj.xdevapi.Statement;
public class Insert {
	

	
	
		public static void insert()
		{
			Scanner sc=new Scanner(System.in);
			String name;
			int s1,s2,s3;
			System.out.println("enter the name of pig");
			name=sc.next();
			System.out.println("enter the sub1marks ");
			s1=sc.nextInt();
			System.out.println("enter the sub1marks ");
			s2=sc.nextInt();
			System.out.println("enter the sub1marks ");
			s3=sc.nextInt();
			try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/pig", "root", "root");
			java.sql.Statement statement=connection.createStatement();
			String query ="insert into pig.pig1(`id`,`name`,`sub1marks`,`sub2marks`,`sub3marks`) values('7','"+name+"','"+s1+"','"+s2+"','"+s3+"')";
			statement.executeUpdate(query);
			System.out.println("data inserted successfully");
			}
			
			
			catch(Exception e) {
				System.out.println(e);
			}
			
		}

}



