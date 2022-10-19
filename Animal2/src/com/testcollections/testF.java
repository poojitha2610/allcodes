package com.testcollections;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class testF {

	public static void main(String[] args) {
		HashMap m=new HashMap();System.out.println("**********hashmap calls .equals() where as IdentityHashMap calls "==" method to compare keys");
     Integer i1=new Integer(10);
     Integer i2=new Integer(10);
     m.put(i1, "pawan");
     m.put(i2, "pawan1");
     System.out.println(m);
	}

}
