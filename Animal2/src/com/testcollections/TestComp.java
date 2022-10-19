package com.testcollections;

import java.util.Stack;

public class TestComp {

	public static void main(String[] args) {
		Stack< Employee> integers=new Stack<>();
//		e2.g
//		Employee e1=new Employee("pooji",10);
//		Employee e2=new Employee("poi",10);
//		Employee e3=new Employee("poji",10);
//		Employee e4=new Employee("po",11);
//		integers.push(e1);
//		integers.push(e2);
//		integers.push(e3);
	//
		System.out.println(integers.empty());
		System.out.println(integers.peek());
		System.out.println(integers.capacity());
		System.out.println(integers.clone());
		//System.out.println(integers.search(e2));
		System.out.println(integers.pop());
		
	for(Employee e:integers) {
			System.out.println(e.getE_id());
	}
		//System.out.println(integers.toString());
	}

}
class Employee{
	String e_name;
	int e_id;
	
	public String getE_name() {
		return e_name;
	}
	public int getE_id() {
		return e_id;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	public void setE_id(int e_id) {
		this.e_id = e_id;
	}
	
	
}

