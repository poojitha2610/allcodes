package com.vegetable;

import java.util.Scanner;
public class veg {

	





          String v[]= new String[10];
           int r[]= new int[10];
           int q[]=new int[10];
    
        public static void main(String[] args){
           
                //System.out.println("press 1 to continue ");
            //System.out.println(" any key exit ");
           // int con=sc.nextInt();
           while(true) {
               
           System.out.println("1.seller\n2.customer");
            Scanner sc=new Scanner(System.in);
            int choice =sc.nextInt();
            if(choice==1){
            veg m=new veg();
            m.seller();
                
            }
            else{
                purchase();
            }
            System.out.println("enter 1 continue or any key to stop");
            int con =sc.nextInt();
            if(con==1){continue;}
           
           else{
               System.out.println("thank you and visit again");
               break;}
            }
        }    



       public   void seller(){
            try {
         Scanner sc=new Scanner(System.in);
            System.out.println("Welcome");
            System.out.println("enter the number of vegetables for sale");
             int m=sc.nextInt();
           
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
                System.out.println( " item"+v[i]+"quantity"+q[i]+"rateof 1 kg"+r[i]+"rs"+"\n");
            }
              
            }catch(Exception e) {
                System.out.println(e);
                seller();
            }
        }
public  static void purchase(){
    System.out.print("vegetables available..........  ");
    System.out.println("1.tomato\n 2.carrot\n3.beetroot\n 4.onion");
    System.out.println("price of tomato: 25 , available quantity :100kg");
    System.out.println("price of carrot: 20 ,available quantity :100kg");
    System.out.println("price of beetroot: 25 , available quantity :100kg");
    System.out.println("price of onion : 25 rs, available quantity :100kg");
    veg m=new veg();
    Scanner sc=new Scanner(System.in);
    System.out.println(" select vegetable to buy\n 1.tomato\n 2.carrot\n3.beetroot\n 4.onion");
    int choice =sc.nextInt();
    int t,c,b,o;
    switch(choice){
        
      case 1:t=tomato();System.out.println("available quantity");System.out.println("tomato"+t+"kg");System.out.println("carrot=100\n beetroot=100\n onion=1ookg");break;
      case 2:c=carrot();System.out.println("available quantity");System.out.println("carrot"+c);System.out.println("tomato=100\n beetroot=100\n onion=1ookg");break;
      case 3: b=beetroot();System.out.println("available quantity");  System.out.println("beetroot"+b);System.out.println("caroot=100\n tomato=100\n onion=1ookg");break;
      case 4: o=onion();System.out.println("available quantity");System.out.println("onion"+o);System.out.println("carrot=100\n beetroot=100\n tomato=1ookg");break;
      default:System.out.println("not available ");
    }

}
public static  int tomato()
{
    int q=100;
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the quantity to buy");
   int quan =sc.nextInt();
   if(quan>=100){
       System.out.println("available quantity :100kg");
   }
   else{
       int price=25*quan;
       System.out.println("your bill"+price+"Rs.");
       
   }
   return q-quan;
    
}
public static  int  carrot()
{
     int q=100;
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the quantity to buy");
   int quan =sc.nextInt();
   if(quan>=100){
       System.out.println("available quantity :100kg");
   }
   else{
       int price=20*quan;
        System.out.println("your bill"+price+"Rs.");
   }
   return q-quan;
    
}
public static  int  beetroot()
{
    
     int q=100;
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the quantity to buy");
   int quan =sc.nextInt();
   if(quan>=100){
       System.out.println("available quantity :100kg");
   }
   else{
       int price=25*quan;
        System.out.println("your bill"+price+"Rs.");
   }
   return q-quan;
}
public static  int onion()
{
     int q=100;
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the quantity to buy");
   int quan =sc.nextInt();
   if(quan>=100){
       System.out.println("available quantity :100kg");
   }
   else{
       int price=25*quan;
        System.out.println("your bill"+price+"Rs.");
   }
   return q-quan;
    
}

	}


