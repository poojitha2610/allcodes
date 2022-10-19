package com.java.practiceee;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
//
//class Singleton{
//	public String s;
//	private static Singleton single_instance=null;
//	private Singleton() {
//		s="fuuuuuu  ";
//	}
//	public void  getId(int id) {
//		this.id=id;
//	}
//	public String getName(String name) {
//		this.name=name;
//	}
//	public static Singleton getInstance() 
//	{
//	     if(single_instance==null) 
//	              single_instance=new Singleton();
//	     return single_instance;
//	    		 
//	}
//}
//public class Test {
//
//public static void main(String[] args) {
//    ArrayList<String> listOfNames = new ArrayList<String>();
//    Scanner input = new Scanner(System.in);
//    System.out.println("What is your name: ");
//    String name = input.nextLine();
//    listOfNames.add(name);
//}
final public class Employee {

	public static void main(String[] args) {
		//Singleton obj=Singleton.getInstance();
		 HashMap<String, Integer> map = new HashMap<>();
		 System.out.println();
		 Scanner sc=new Scanner(System.in);
		 System.out.println("1.To enter the employee details");
	     System.out.println("2. display");
		 System.out.println("delete");
		 while(true) {
				System.out.println("1.add 2.dispaly");
		        int choice=sc.nextInt();
		         if(choice==1) {
			         System.out.println("enter the emp_id");
	                 System.out.println("enter the emp_name");
		              while(true) {
		            	    
			                int e_id=sc.next();
			                String e_name=sc.next();
			                if(e_id=="end") {
			                	
			                }
			                map.put(e_name, e_id);
		                            }
	                             }
		           else  {
			  //System.out.println(map);
			           Set<String> set=map.keySet();
			           Set<Integer> setOfValues = new HashSet<Integer>(map.values());
//              for(int i=0;i<map.size();i++) {
//            	  for(int j=0;j<map.size();j++) {
//            		  if(map[key]==)
//            	  }
//              }
			  System.out.println(set+"   "+setOfValues);
		 }
		
		
	}}
	

}
