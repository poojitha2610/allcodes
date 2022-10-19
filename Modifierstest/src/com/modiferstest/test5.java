package com.modiferstest;
abstract class vehicle{  
	  abstract void run();  
	}

	
 class test5 extends vehicle {
	
		public static void main(String args[])
		{
			
		 test5 obj=new test5();
		  obj.run();  
		} 
		void run()
		{
			System.out.println("running safely");
		}
}  

