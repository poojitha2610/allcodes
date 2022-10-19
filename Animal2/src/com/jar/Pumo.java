package com.jar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Pumo {
	public static void main(String[] args ) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the num and den");
		try {
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int c;
		
		
			c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e){
			System.out.println("enter the input correctly");
			Pumo.main(args);
			
		}
		catch(InputMismatchException e )
		{
			System.out.println("enter the correct input");
			Pumo.main(args);
		}
		finally {
			
		}
		
	}

}
