package com.test;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	      System.out.println("enter customers budget");
	      long fixedbudget=sc.nextLong();
	      while(true) {
	    	  System.out.println("enter 1 to continue or 0 to exit");
	          int choice=sc.nextInt();
	          if(choice==1){
	              
	              System.out.println ("1.Electronics");
	              System.out.println ("2.Bath");
	              System.out.println ("3.kITCHEN");
	              System.out.println ("4.clothes");
	              System.out.println ("5.toys section");
	              System.out.println ("enter ur choice");
	            int c = sc.nextInt ();
	            switch(c) {
	            case 1: System.out.println("minimum balance to purchase in this section is 6000");
	        	int e_q1 = 15;
	        	int e_q2 = 10;
	        	int e_q3 = 11;
	        	int e_c1 = 40000;
	        	int e_c2 = 50000;
	        	int e_c3 = 6000;
	        	if(fixedbudget<e_c1&&fixedbudget<e_c2&&fixedbudget<e_c3){
	        	    System.out.println("you have insufficient funds");
	        	    System.out.println("go to next section");
	        	}
	        	else{
	        	long e_cost1=0;
	        	long e_cost2=0;
	        	long e_cost3=0;
	        	System.out.println ("1.Electronics:TELEVISION");
	        	  System.out.println ("item id:1.Samsung");
	        	  System.out.println ("item id:2.Sony");
	        	  System.out.println ("item id:3.Croma");
	        	  System.out.println ("enter id which u want");
	        	int e_id = sc.nextInt ();
	        	if (e_id == 1)
	        	  {
	        	      if(fixedbudget>=e_c1){
	        	    System.out.println ("item id:1.Samsung");
	        	    System.out.println ("cost of item=" + " " + e_c1);
	        	    System.out.println ("available quantity is" + " " + e_q1);
	        	    System.out.println ("enter required quantity");
	        	    int e_q = sc.nextInt ();
	        	    e_cost1 = e_q * e_c1;
	        	    if(e_cost1>=fixedbudget) {
	        	    	System.out.println("insufficient funds");
	        	    }
	        	    else
	        	    {
	        	    fixedbudget=fixedbudget-e_cost1 ;
	        	      System.out.println ("cost=" + e_cost1);
	        	      System.out.println ("remaining quantity" + " " + (e_q1 - e_q));
	        	      System.out.println("remaining balance="+" "+(fixedbudget));
	        	    }
	        	  
	        	     // else{ System.out.println("insufficient funds"+":"+fixedbudget);break;}
	        	  }
	        	else if (e_id == 2)
	        	  {if(fixedbudget>=e_c2){
	        	    System.out.println ("item id:2.Sony");
	        	    System.out.println ("cost of item=" + " " + e_c2);
	        	    System.out.println ("available quantity is" + " " + e_q2);
	        	    System.out.println ("enter required quantity");
	        	    int e_q = sc.nextInt ();
	        	     e_cost2 = e_q * e_c2;
	        	     if(e_cost2>=fixedbudget) {
	        		    	System.out.println("insufficient funds");
	        		    }
	        	     else {
	        	     fixedbudget=fixedbudget-e_cost2 ;
	        	    System.out.println ("cost=" + e_cost2);
	        	    System.out.println ("remaining quantity" + " " + (e_q2 - e_q));
	        	    System.out.println("remaining balance="+" "+(fixedbudget));
	        	  }}
//	        	      else{
//	        	           System.out.println("insufficient funds"+":"+fixedbudget);break;}
	        	  }
	        	else if (e_id == 3)
	        	  {if(fixedbudget>=e_c3){
	        	    System.out.println ("item id:3.Croma");
	        	    System.out.println ("cost of item=" + " " + e_c3);
	        	    System.out.println ("available quantity is" + " " + e_q3);
	        	    System.out.println ("enter required quantity");
	        	    int e_q = sc.nextInt ();
	        	    e_cost3 = e_q * e_c3;
	        	    if(e_cost3>=fixedbudget) {
	        	    	System.out.println("insufficient funds");
	        	    }
	        	    else {
	        	    fixedbudget=fixedbudget-e_cost3;
	        	    System.out.println ("cost=" + e_cost3);
	        	    System.out.println ("remaining quantity" + ":" + (e_q3 - e_q));
	        	    System.out.println("remaining balance="+" "+(fixedbudget));
	        	    }

	        	  }
//	        	      else{
//	        	          System.out.println("insufficient funds"+" "+fixedbudget);break;}
	        	  }
//	        	 long e_bill=(e_cost1+e_cost2+e_cost3);
//	        	  System.out.println("total bill in electronics="+e_bill);
	           
	        	}
	        	};break;
	            case 2:
	            	System.out.println("minimum balance to purchase in this section is 500");
	            	int b_q1 = 15;
	            	int b_q2 = 10;
	            	int b_q3 = 10;
	            	int b_c1 = 500;
	            	int b_c2 = 1000;
	            	int b_c3 = 1500;
	            	if(fixedbudget<b_c1&&fixedbudget<b_c2&&fixedbudget<b_c3){
	            	     System.out.println("you have insufficient funds");
	            	    System.out.println("go to next section");
	            	}
	            	else{
	            	long b_cost1=0;
	            	long b_cost2=0;
	            	long b_cost3=0;
	            	System.out.println ("2.Bath");
	            	System.out.println ("item id:1.Taps");
	            	System.out.println ("item id:2.Shower");
	            	 System.out.println ("item id:3.Wash basins");
	            	System.out.println ("enter id which u want");
	            	int b_id = sc.nextInt ();
	            	if (b_id == 1)
	            	  {if(fixedbudget>=b_c1){
	            	    System.out.println ("item id:1.Taps");
	            	   System.out.println ("cost of item=" + " " + b_c1);
	            	    System.out.println ("available quantity is" + " " + b_q1);
	            	    System.out.println ("enter required quantity");
	            	    int b_q = sc.nextInt ();
	            	    b_cost1 = b_q * b_c1;
	            	    if(b_cost1>=fixedbudget) {
	            	    	System.out.println("insufficient funds");
	            	    }
	            	    else {
	            	    fixedbudget=fixedbudget-b_cost1 ;
	            	    System.out.println ("cost=" + b_cost1);
	            	    System.out.println ("remaining quantity" + " " + (b_q1 - b_q));
	            	    System.out.println("remaining balance="+" "+(fixedbudget));
	            	  }}
//	            	  else{
//	            	           System.out.println("insufficient funds"+":"+fixedbudget);break;}}
	            	else if (b_id == 2)
	            	  {  if(fixedbudget>=b_c2){
	            	    System.out.println ("item id:2.Shower");
	            	    System.out.println ("cost of item=" + " " +b_c2);
	            	    System.out.println ("available quantity is" + " " + b_q2);
	            	    System.out.println ("enter required quantity");
	            	    int b_q = sc.nextInt ();
	            	     b_cost2= b_q * b_c2;
	            	     if(b_cost2>=fixedbudget) {
	            		    	System.out.println("insufficient funds");
	            		    }
	            	     else {
	            	     fixedbudget=fixedbudget-b_cost2 ;
	            	    System.out.println ("cost=" + b_cost2);
	            	    System.out.println ("remaining quantity" + " " + (b_q2 - b_q));
	            	    System.out.println("remaining balance="+" "+(fixedbudget));
	            	  }}
	            	  else{
	            	           System.out.println("insufficient funds"+":"+fixedbudget);break;}}
	            	else if (b_id == 3)
	            	  {if(fixedbudget>=b_c3){
	            	    System.out.println ("item id:3.Wash basins");
	            	    System.out.println ("cost of item=" + " " + b_c3);
	            	    System.out.println ("available quantity is" + " " + b_q3);
	            	    System.out.println ("enter required quantity");
	            	    int b_q = sc.nextInt ();
	            	    b_cost3 = b_q * b_c3;
	            	    if(b_cost3>=fixedbudget) {
	            	    	System.out.println("insufficient funds");
	            	    }
	            	    else {
	            	    fixedbudget=fixedbudget-b_cost3 ;
	            	    System.out.println ("cost=" + b_cost3);
	            	    System.out.println ("remaining quantity" + " " + (b_q3 - b_q));
	            	    System.out.println("remaining balance="+" "+(fixedbudget));
	            	    }
	            	  }
	            	  }
	            	  }
	            	
	            };break;
	            case 3:
	            	System.out.println("minimum balance to purchase in this section is 3000");
	            	int k_q1 = 15;
	            	int k_q2 = 10;
	            	int k_q3 = 11;
	            	int k_c1 = 4000;
	            	int k_c2 = 10000;
	            	int k_c3 = 3000;
	            	if(fixedbudget<k_c1&&fixedbudget<k_c2&&fixedbudget<k_c3){
	            	     System.out.println("you have insufficient funds");
	            	    System.out.println("go to next section");
	            	}
	            	else{
	            	long k_cost1=0;
	            	long k_cost2=0;
	            	long k_cost3=0;
	            	System.out.println ("3.kITCHEN");
	            	System.out.println ("item id:1.Stove");
	            	System.out.println ("item id:2.MIXER");
	            	System.out.println ("item id:3.Utensils set");
	            	System.out.println ("enter id which u want");
	            	int k_id = sc.nextInt ();
	            	if (k_id == 1)
	            	  {
	            	      if(fixedbudget>=k_c1){
	            	    System.out.println ("item id:1.Stove");
	            	    System.out.println ("cost of item=" + " " + k_c1);
	            	    System.out.println ("available quantity is" + " " + k_q1);
	            	    System.out.println ("enter required quantity");
	            	    int k_q = sc.nextInt ();
	            	     k_cost1= k_q * k_c1;
	            	     if(k_cost1>=fixedbudget) {
		            	    	System.out.println("insufficient funds");
		            	    }
	            	     else {
	            	     fixedbudget=fixedbudget-k_cost1 ;
	            	    System.out.println ("cost=" + k_cost1);
	            	    System.out.println ("remaining quantity" + " " + (k_q1 - k_q));
	            	    System.out.println("remaining balance="+" "+(fixedbudget));
	            	  }
	            	      }
	            	  }
	            	else if (k_id == 2)
	            	  { if(fixedbudget>=k_c2){
	            	    System.out.println ("item id:2.MIXER");
	            	    System.out.println ("cost of item=" + " " + k_c2);
	            	    System.out.println ("available quantity is" + " " + k_q2);
	            	    System.out.println ("enter required quantity");
	            	    int k_q = sc.nextInt ();
	            	     k_cost2 = k_q * k_c2;
	            	     if(k_cost2>=fixedbudget) {
		            	    	System.out.println("insufficient funds");
		            	    }
	            	     else {
	            	     fixedbudget=fixedbudget-k_cost2 ;
	            	    System.out.println ("cost=" + k_cost2);
	            	    System.out.println ("remaining quantity" + " " + (k_q2 - k_q));
	            	    System.out.println("remaining balance="+" "+(fixedbudget));
	            	  }
	            	  }
	            	}
	            	else if (k_id == 3)
	            	  { if(fixedbudget>=k_c3){
	            	    System.out.println ("item id:3.Utensils set");
	            	    System.out.println ("cost of item=" + " " + k_c3);
	            	    System.out.println ("available quantity is" + " " + k_q3);
	            	    System.out.println ("enter required quantity");
	            	    int k_q = sc.nextInt ();
	            	     k_cost3 = k_q * k_c3;
	            	     if(k_cost3>=fixedbudget) {
		            	    	System.out.println("insufficient funds");
		            	    }
	            	     else {
	            	     fixedbudget=fixedbudget-k_cost3;
	            	    System.out.println ("cost=" + k_cost3);
	            	    System.out.println ("remaining quantity" + " " + (k_q3 - k_q));
	            	    System.out.println("remaining balance="+" "+(fixedbudget));
	            	     
	            	  }
	            	  }
	            	}
	            };break;
	            case 4:
	            	 System.out.println("minimum balance to purchase in this section is 1000");
	            		int c_q1 = 15;
	            		int c_q2 = 10;
	            		int c_q3 = 11;
	            		int c_c1 = 2000;
	            		int c_c2 = 1000;
	            		int c_c3 = 1000;
	            		if(fixedbudget<c_c1&&fixedbudget<c_c2&&fixedbudget<c_c3){
	            		     System.out.println("you have insufficient funds");
	            		    System.out.println("go to next section");
	            		}
	            		else{
	            		long c_cost1=0;
	            		long c_cost2=0;
	            		long c_cost3=0;
	            		System.out.println ("4.clothes");
	            		System.out.println ("item id:1.Sweatshirts");
	            		System.out.println ("item id:2.Jeans");
	            		System.out.println ("item id:3.Kurtis");
	            		System.out.println ("enter id which u want");
	            		int c_id = sc.nextInt ();
	            		if (c_id == 1)
	            		  {  if(fixedbudget>=c_c1){
	            		    System.out.println ("item id:1.Sweatshirts");
	            		    System.out.println ("cost of item=" + " " +c_c1);
	            		    System.out.println ("available quantity is" + " " + c_q1);
	            		    int c_q = sc.nextInt ();
	            		    c_cost1 = c_q * c_c1;
	            		    if(c_cost1>=fixedbudget) {
	    	        	    	System.out.println("insufficient funds");
	    	        	    }
	            		    else {
	            		    fixedbudget=fixedbudget-c_cost1 ;
	            		    System.out.println ("cost=" + c_cost1);
	            		    System.out.println ("remaining quantity" + " " + (c_q1 - c_q));
	            		    System.out.println("remaining balance="+" "+(fixedbudget));
	            		    }
	            		  }
	            		  }
	            		
	            		else if (c_id == 2)
	            		  { if(fixedbudget>=c_c2){
	            		    System.out.println ("item id:2.Jeans");
	            		    System.out.println ("cost of item=" + " " + c_c2);
	            		    System.out.println ("available quantity is" + " " + c_q2);
	            		    int c_q = sc.nextInt ();
	            		    c_cost2 = c_q * c_c2;
	            		    if(c_cost2>=fixedbudget) {
	    	        	    	System.out.println("insufficient funds");
	    	        	    }
	            		    else {
	            		    fixedbudget=fixedbudget-c_cost2;
	            		    System.out.println ("cost=" + c_cost2);
	            		    System.out.println ("remaining quantity" + " " + (c_q2 - c_q));
	            		    System.out.println("remaining balance="+" "+(fixedbudget));
	            		  }
	            		  }
	            		  }
	            		else if (c_id == 3)
	            		  { if(fixedbudget>=c_c3){
	            		    System.out.println ("item id:3.Kurtis");
	            		    System.out.println ("cost of item=" + " " + c_c3);
	            		    System.out.println ("available quantity is" + " " + c_q3);
	            		    int c_q = sc.nextInt ();
	            		     c_cost3 = c_q * c_c3;
	            		     if(c_cost3>=fixedbudget) {
		    	        	    	System.out.println("insufficient funds");
		    	        	    }
	            		     else {
	            		     fixedbudget=fixedbudget-c_cost3 ;
	            		    System.out.println ("cost=" + c_cost3);
	            		    System.out.println ("remaining quantity" + " " + (c_q3 - c_q));
	            		    System.out.println("remaining balance="+" "+(fixedbudget));
	            		  }}
	            		  }
	          
	            		};break;
	            case 5:
	            	System.out.println("toys section");
	           default:
	        	   System.out.println("you have entered wrong section");
	            
	          }
	      }
	          else {
	        	  System.out.println("thank u");
	        	  break;
	          }
	}
}
}