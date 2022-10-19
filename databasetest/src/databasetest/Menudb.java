package databasetest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menudb {

	public static void main(String[] args) {
		try  {
			Scanner sc = new Scanner(System.in);
			System.out.println("1.display");
			System.out.println("2.insert");
			System.out.println("3.delete");
			System.out.println("enter the operation to perform");
			int choice=sc.nextInt();	
			switch(choice) {
			case 1: dbtest.display(); break;
			case 2: Insert.insert();  break;
			case 3:delete.del();    break;
			default: System.out.println("enter correct choice"); main(args);
			}
		}
		catch(InputMismatchException e) {
			System.out.println(e);
		}
		
		// TODO Auto-generated method stub

	}

}
