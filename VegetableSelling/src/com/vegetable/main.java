package com.vegetable;
import java.util.Scanner;

public class main {
	
	    public static void main(String[] args){
	        seller();
	    }
	    public   static void seller(){
	    	try {
	     Scanner sc=new Scanner(System.in);
	        System.out.println("Welcome");
	        System.out.println("enter the number of vegetables for sale");
	         int m=sc.nextInt();
	       String v[]= new String[m];
	       int r[]= new int[m];
	       int q[]=new int[m];
	      for(int i=0;i<m;i++){
	          System.out.println("enter the "+(i+1)+"vegetable name  for sale ");
	           v[i]=sc.next();
	           System.out.println("enter the"+v[i]+" quantity for sale");
	           q[i]=sc.nextInt();
	           System.out.println("enter the"+v[i]+"ratefor sale");
	           r[i]=sc.nextInt();
	           
	        }      
	            System.out.println("Items added for sale.......");
	        for(int i=0;i<m;i++){
	            System.out.println( " item"+v[i]+"quantity"+q[i]+"rateof 1 kg"+r[i]+"\n");
	        }
	    	}catch(Exception e) {
	    		System.out.println(e);
	    		seller();
	    	}
	    	
	       
	    }
	    
	    
	}


