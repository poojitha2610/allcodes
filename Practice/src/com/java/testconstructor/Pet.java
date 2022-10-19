package com.java.testconstructor;

public class Pet extends petmom{

	public static void main(String[] args) {
		Pet pet=new Pet();
		petmom p=(petmom)pet; //upcasting the class//but directly downcasting (parent to child)is not possible
		Pet p1=(Pet)p;//downcasting the class
		Pet pm=(Pet)((petmom)(pet));//simplified expression for above 3 stmts
		pm.mr();
		
		p.mr();
		p1.mr();
		System.out.println(p.i);
		System.out.println(p1.i);
 
	}

}
  class petmom {
	int i=10;
	public  static void mr() {
		System.out.println("hello mr");
	}
}
