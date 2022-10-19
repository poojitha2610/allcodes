package com.java.testgrocery;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
        
     static double bill=0;
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 final  float r_budget;
		 
   	     System.out.println("enter your budget");
   	     r_budget=sc.nextInt();
   	     float budget=r_budget;
		System.out.println("sections are:");
		System.out.println("1.Electronics\n"
				+ "2.Bath\n"
				+ "3.Kitchen\n"
				+ "4.Cloths\n"
				+ "5.shoes");
		while(true) {
		System.out.println("enter the choice and press 0 to exit  ");
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1: System.out.println("welcome to electronics");
			       int min_price=2000;
			       if(budget<=min_price) {
			    	   System.out.println("your minimum budget should be"+min_price);
			    	   System.out.println("please try another section");
			    	   break;
			       }
			       else {
			    	   int e_available=10;
			    	   System.out.println("items available");
			    	   System.out.println("1.Television \n2.washing machine\n3.fridge\n4.smartphone\n5.watch");
			    	   System.out.println("availability of items :"+e_available);
			    	   int t_cost=8000,w_cost=10000,f_cost=6000,s_cost=5000,w_cos=1000;
			    	   ArrayList<Integer> a=new ArrayList<>(Arrays.asList(8000,10000,6000,5000,1000));
			    	   System.out.println("1.Television"+t_cost+" \n2.washing machine"+w_cost+"\n3.fridge"+f_cost+"\n4.smartphone"+s_cost+"\n5.watch"+w_cos);
			    	   int e_choice=sc.nextInt();
			    	  
			    		  System.out.println("enter number of items to buy------>");
			    		  int q_e=sc.nextInt();
			    		  int e_price=q_e*a.get((e_choice-1));
			    		  if(e_price>=budget) {
			    			  System.out.println("insufficient budget");
			    		  }
			    		  else {
			    			  budget=budget-e_price;
			    			  System.out.println("your bill"+(bill+e_price));
			    			  System.out.println("remaining budget"+(budget));
			    		  }
			    		  
			    	   };break;
			case 2:
				System.out.println("welcome to Bathitems");
			       int min_price1=100;
			       if(budget<=min_price1) {
			    	   System.out.println("your minimum budget should be"+min_price1);
			    	   System.out.println("please try another section");
			    	   break;
			       }
			       else {
			    	   int b_available=10;
			    	   System.out.println("items available");
			    	   System.out.println("1.soap \n2.toothbrush\n3.mug\n4.bucket\n5towel.");
			    	   System.out.println("availability of items :"+b_available);
			    	   int t_cost=80,w_cost=100,f_cost=60,s_cost=50,w_cos=100;
			    	   ArrayList<Integer> a=new ArrayList<>(Arrays.asList(80,100,60,50,100));
			    	   System.out.println("1.soap"+t_cost+" \n2.toothbrush"+w_cost+"\n3.mug"+f_cost+"\n4.bucket"+s_cost+"\n5.towel"+w_cos);
			    	   int e_choice=sc.nextInt();
			    	  
			    		  System.out.println("enter number of items to buy------>");
			    		  int q_e=sc.nextInt();
			    		  int e_price=q_e*a.get((e_choice-1));
			    		  if(e_price>=budget) {
			    			  System.out.println("insufficient budget");
			    		  }
			    		  else {
			    			  budget=budget-e_price;
			    			  System.out.println("your bill"+(bill+e_price));
			    			  System.out.println("remaining budget"+(budget));
			    		  }
			    		  
			    	   };break;
			case 3:
				System.out.println("welcome to kitchen");
			       int min_price2=90;
			       if(budget<=min_price2) {
			    	   System.out.println("your minimum budget should be"+min_price2);
			    	   System.out.println("please try another section");
			    	   break;
			       }
			       else {
			    	   int b_available=10;
			    	   System.out.println("items available");
			    	   System.out.println("1.pan \n2.cooker\n3.stove\n4.knife\n5chopping board.");
			    	   System.out.println("availability of items :"+b_available);
			    	   int t_cost=500,w_cost=900,f_cost=600,s_cost=50,w_cos=100;
			    	   ArrayList<Integer> a=new ArrayList<>(Arrays.asList(500,900,600,50,100));
			    	   System.out.println("1.pan"+t_cost+" \n2.cooker"+w_cost+"\n3.stove"+f_cost+"\n4.knife"+s_cost+"\n5.chopping board"+w_cos);
			    	   int e_choice=sc.nextInt();
			    	  
			    		  System.out.println("enter number of items to buy------>");
			    		  int q_e=sc.nextInt();
			    		  int e_price=q_e*a.get((e_choice-1));
			    		  if(e_price>=budget) {
			    			  System.out.println("insufficient budget");
			    		  }
			    		  else {
			    			  budget=budget-e_price;
			    			  System.out.println("your bill"+(bill+e_price));
			    			  System.out.println("remaining budget"+(budget));
			    		  }
			    		  
			    	   };break;
			    		    		   
			case 4:
				   System.out.println("welcome to p_trends collections");
			       int min_price3=350;
			       if(budget<=min_price3) {
			    	   System.out.println("your minimum budget should be"+min_price3);
			    	   System.out.println("please try another section");
			    	   break;
			       }
			       else {
			    	   int b_available=10;
			    	   System.out.println("items available");
			    	   System.out.println("1.kurta \n2.jeans\n3.croptop\n4.sweatshirts\n5.hoodies");
			    	   System.out.println("availability of items :"+b_available);
			    	   int t_cost=500,w_cost=900,f_cost=150,s_cost=500,w_cos=1000;
			    	   ArrayList<Integer> a=new ArrayList<>(Arrays.asList(500,900,150,500,1000));
			    	   System.out.println("1.kurta"+t_cost+" \n2.jeans"+w_cost+"\n3.croptop"+f_cost+"\n4.sweatshirts"+s_cost+"\n5.hoodies"+w_cos);
			    	   int e_choice=sc.nextInt();
			    	  
			    		  System.out.println("enter number of items to buy------>");
			    		  int q_e=sc.nextInt();
			    		  int e_price=q_e*a.get((e_choice-1));
			    		  if(e_price>=budget) {
			    			  System.out.println("insufficient budget");
			    		  }
			    		  else {
			    			  budget=budget-e_price;
			    			  System.out.println("your bill"+(bill+e_price));
			    			  System.out.println("remaining budget"+(budget));
			    		  }
			    		  
			    	   };break;
			case 5:
				   System.out.println("welcome to shoes collections");
			       int min_price4=1050;
			       if(budget<=min_price4) {
			    	   System.out.println("your minimum budget should be"+min_price4);
			    	   System.out.println("please try another section");
			    	   break;
			       }
			       else {
			    	   int b_available=10;
			    	   System.out.println("items available");
			    	   System.out.println("1.heels \n2.flats\n3.chapals\n4.flippers\n5.sport shoes");
			    	   System.out.println("availability of items :"+b_available);
			    	   int t_cost=500,w_cost=160,f_cost=80,s_cost=500,w_cos=1000;
			    	   ArrayList<Integer> a=new ArrayList<>(Arrays.asList(500,160,80,500,1000));
			    	   System.out.println("1.heels"+t_cost+" \n2.flats"+w_cost+"\n3.chapals"+f_cost+"\n4.flippers"+s_cost+"\n5.sport shoes"+w_cos);
			    	   int e_choice=sc.nextInt();
			    	  
			    		  System.out.println("enter number of items to buy------>");
			    		  int q_e=sc.nextInt();
			    		  int e_price=q_e*a.get((e_choice-1));
			    		  if(e_price>=budget) {
			    			  System.out.println("insufficient budget");
			    		  }
			    		  else {
			    			  budget=budget-e_price;
			    			  System.out.println("your bill"+(bill+e_price));
			    			  System.out.println("remaining budget"+(budget));
			    		  }
			    		  
			    	   };break;
			    	default:
			    		System.out.println("try again");;
			       }
		  
			    if(choice==0)	{
			    	
			    	System.out.println("thank you visit again");
			    	break;
			    }
			
			
		}
		
	}
        
	}


