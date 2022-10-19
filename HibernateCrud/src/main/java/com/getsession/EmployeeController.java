package com.getsession;

import java.util.ArrayList;
import java.util.Scanner;



import com.testModel.Employee;
import com.testhiber.HibernateCrud.EmployeeProvider;

public class EmployeeController {

	public static void addData() {
		Scanner sc=new Scanner(System.in);
		Employee employee=new Employee();
		//System.out.println("enter the employee id:");employee.setId(sc.nextInt());
		System.out.println("enter  the employee name:");employee.setName(sc.next());
		System.out.println("enter the employee salary:");employee.setSalary(sc.nextFloat());
		EmployeeProvider employeeProvider=new EmployeeProvider();
		employeeProvider.addEmpployee(employee);
	}
	public static void displayData() {
		Scanner sc=new Scanner(System.in);
		Employee employee=new Employee();
		System.out.println("enter the employee id:");employee.setId(sc.nextInt());
		EmployeeProvider employeeProvider=new EmployeeProvider();
		Employee e=employeeProvider.displayEmployee(employee);
		System.out.println("name:"+e.getName()+"  salary:"+e.getSalary());

	}
	public static void deleteData() 
	{
		Scanner sc=new Scanner(System.in);
		Employee employee=new Employee();
		System.out.println("enter the employee id:");employee.setId(sc.nextInt());
		EmployeeProvider employeeProvider=new EmployeeProvider();
		employeeProvider.deleteEmployee(employee);
	}
	public static void updateData() {
		Scanner sc=new Scanner(System.in);
		Employee employee=new Employee();
		System.out.println("enter the employee id:");employee.setId(sc.nextInt());
		EmployeeProvider employeeProvider=new EmployeeProvider();
		employeeProvider.updateEmployee(employee);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		while(true) {
			System.out.println("1.add_Employeee\n2.display_Employee\n3.delete_Employee\n4.updateEmployee \n 0 toexit");
			int choice =sc.nextInt();
			switch(choice) {
			case 1:addData();break;
			case 2:displayData();break;
			case 3: deleteData();break;
			case 4:updateData();break;
			default: System.out.println("try again");System.exit(0);    

			}
			if(choice==0)
				break;

		}
	}

}

