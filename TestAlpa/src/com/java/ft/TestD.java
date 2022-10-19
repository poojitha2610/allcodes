package com.java.ft;

import java.util.Comparator;
import java.util.TreeSet;

public class TestD {

	public static void main(String[] args) {
		Employee e1=new Employee("pooji",19);
		Employee e2=new Employee("poi",10);
		Employee e3=new Employee("poji",11);
	    Employee e4=new Employee("po",111);
       TreeSet<Employee> t=new TreeSet<>(new Mycomparator() );
       t.add(e1);
       t.add(e2);
       t.add(e3);
       t.add(e4);
       for(Employee e:t)
           System.out.println(e.id+" "+e.name);
	}

}
class Mycomparator implements  Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1=(Employee)o1;
		Employee e2=(Employee)o2;
		String s1=e1.name;
		String s2=e2.name;
		return -s1.compareTo(s2);
	}
	
}
class Employee implements Comparable{
	String name;
	int id;
	public Employee(String name,int id) {
		this.name=name;
		this.id=id;// TODO Auto-generated constructor stub
	}
	@Override
	public int compareTo(Object o) {
		int eid1=this.id;
		Employee e=(Employee)o;
		int eid2=e.id;
		if(eid1<eid2)
			return -1;
		else if(eid1>eid2)
			return 1;
		else
			return 0;
		
	}
}