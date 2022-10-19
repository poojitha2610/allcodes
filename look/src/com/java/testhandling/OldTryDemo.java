package com.java.testhandling;
public class OldTryDemo {
	public static void main(String[] args) {
		MyResource res = null;
		try {
			res = new MyResource();
			res.doSomeWork("Writing an article");
		} catch (Exception e) {
			System.out.println(e);
				
		} finally {
			try {
				res.close();
			} catch (Exception e) {
				System.out.println("Exception Message: " + e.getMessage()
						+ " Exception Type: " + e.getClass().getName());
			}
		}
	}
}