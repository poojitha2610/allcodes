package com.modiferstest;
class P{
	final public void property(){
		System.out.println("cashh....");
	}
}
class C  extends P{
	public void property()
	{
		System.out.println("cashh1....");
	}
}
public class test1 {

	public static void main(String[] args) {
		C  c=new C();
		c.property();
	}

}
