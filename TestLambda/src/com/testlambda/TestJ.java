package com.testlambda;

public class TestJ {
	public static void main(String[] args) {
		
	   Demo d=(a,b)->a+b;
		
		System.out.println(d);	 
		  
	  int t=d.display(10,20);
	  System.out.println(t);
	}
	 
}
