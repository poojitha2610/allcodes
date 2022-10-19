package databasetest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import java.sql.Statement;
import java.util.ArrayList;


public class DataFrom {
	public static void main(String[] args) {
		
	
	ArrayList<MethodNew> arrayList= new ArrayList<>();
	
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/pig", "root", "root");
		Statement statement=connection.createStatement();
		ResultSet  set=statement.executeQuery("SELECT * FROM pig.employ");
		while(set.next()) {
			MethodNew method=new MethodNew();
			method.setName(set.getString(2));
			method.setId(set.getInt(1));
			method.setZip(set.getInt(3));
			arrayList.add(method);
		}
		for(MethodNew m:arrayList) {
			System.out.println(m.getId() + "  "+ "  "+m.getName()+"  "+m.getZip());
		}
		
	}
	catch(Exception e){
		
	}
	}  
}

