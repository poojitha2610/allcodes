package com.java.testconstructor;

public class Cat2 extends petmom {
	public  static void mr() {
		System.out.println("hello mr and mrs");
	}
	
  public static void main(String[] args) {
	  Cat2 cat2=new Cat2();
	  petmom cu=(petmom)cat2;
		Cat2 co=(Cat2)((petmom)cat2);
		cu.mr();//note:analyse it properly......
		cat2.mr();
		co.mr();
}

}
