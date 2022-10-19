package com.java.testhandling;

public class MyResource {
	
        public void doSomeWork(String work) throws ExceptionA{
            System.out.println("Doing: "+work);
            throw new ExceptionA("Exception occured while doing work");
        }
        public void close() throws Exceptionb{
            System.out.println("Closing the resource");
            throw new Exceptionb("Exception occurred while closing");
        }

}
