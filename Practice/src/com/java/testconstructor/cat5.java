
package com.java.testconstructor;

public class cat5 extends mom {
	static {
		
	}
	cat5(){
		
		super();
		//this(); note:super() and this() are not used simultaneously
		System.out.println("main constructor");
	//this();
	}
	public static void main(String[] args) {
	  new 	cat5();
	}

}
class mom {
//	mom(){
//		
//	}
}
