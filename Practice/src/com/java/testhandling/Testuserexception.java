package com.java.testhandling;

import java.util.Scanner;

public class Testuserexception {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age");
		int age=sc.nextInt();
		if(age<18) {
			throw new TooYoungException("you are too young to be married");
		}
		else if(age>70) {
			throw new TooOldException("you are too old to be married");
		}
		else {
			System.out.println("you will get good matches");
		}

	}

}
class TooYoungException extends RuntimeException{
	public TooYoungException(String s) {
	    	super(s);// TODO Auto-generated constructor stub
	}
}
class TooOldException extends RuntimeException{
	public TooOldException(String s) {
		super(s);
	}
}