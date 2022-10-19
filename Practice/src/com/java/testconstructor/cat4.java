package com.java.testconstructor;

public class cat4 {
	 static int i;
	static {
		i=90;
		m1();
		System.out.println(i);//reading the varaible in a static block direct read
	}
	public  static void m1() {
		System.out.println(i);//reading the variable in a method is indirect read
	}

	public static void main(String[] args) {
		
	}

}
