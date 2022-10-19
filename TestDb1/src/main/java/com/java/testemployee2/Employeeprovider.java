package com.java.testemployee2;
import java.util.ArrayList;
import java.util.Scanner;
public class Employeeprovider {
	public  static  void addData() {
		Scanner sc=new Scanner(System.in);
		Employee employee=new Employee();
		System.out.println("enter the name and password");
		employee.setName(sc.next());
		employee.setPassword(sc.next());
		Employeeservice employeeservice=new Employeeservice();
		employeeservice.addEmployee(employee);
		
	}
	public   static void displayData() {
		Employee employee=new Employee();
		Employeeservice employeeservice=new Employeeservice();
		 ArrayList<Employee> l=employeeservice.displayEmployee(employee);
		for(Employee e :l) {
			System.out.println(e.getName());
			System.out.println(e.getPassword());
		}

	}
	public static void deleteData() {
		Scanner sc=new Scanner(System.in);
		Employee employee=new Employee();
		System.out.println("enter the name ");
		employee.setName(sc.next());
		Employeeservice employeeservice=new Employeeservice();
		employeeservice.deEmployee(employee);
	}
	
public  static String updateData() {
	Scanner sc=new Scanner(System.in);
	Employee employee=new Employee();
	System.out.println("enter the name ");
	String name=sc.next();
	Employeeservice employeeservice=new Employeeservice();
	 ArrayList<Employee> l=employeeservice.displayEmployee(employee);
	
	for(Employee e:l)
	{
		if(e.getName()==name)
		{
			
		}
	}
	System.out.println("enter the new password");
	String pass=sc.next();
	String query="UPDATE `pig`.`employeekit` SET `passsword` = '"+pass+"'  WHERE (`name` = '"+name+"')";
	return query;
}
	public static void main(String[] args) //controller class
	{
		String u;
		System.out.println("enter ur choice 1.add\n2.display\n3.delete\n4.update5.exit");
		Scanner  scanner=new Scanner(System.in);
		while(true) {
		int choice=scanner.nextInt();
		if(choice==1)
			addData();
		else if(choice==2) 
			displayData();
		else if(choice==3)
			deleteData();
		else if(choice==4){
			u= updateData();
			Employeeservice employeeservice=new Employeeservice();
			employeeservice.updateEmployee(u);
			System.out.println("data updated");
		}else
			System.exit(0);
		
		}
	}

}