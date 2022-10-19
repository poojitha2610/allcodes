package com.testcollections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public class TestE {

	public static void main(String[] args) {
     WeakHashMap m=new WeakHashMap();
     Temp t=new Temp();
//     m.put(1, "mom1");
//     m.put(12, "mom2");
//     m.put(13, "mom3");
//     m.put(14, "mom4");
        m.put(t,"durga");
//      Set s=m.keySet();
//      System.out.println(s);
//      Collection c=m.values();
//      System.out.println(c);
//      Set s1=m.entrySet();
//      System.out.println(s1);
//      for(Map.Entry<Integer, String> set : m.entrySet()){
//          System.out.println("          "+set.getKey() + " => " + set.getValue());
//      }
          System.out.println(m);
          t=null;
          System.gc();
          try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          System.out.println(m);
	}

}
class Temp{
 public String toString() {
	return "temp";
	 }
 public void finalise() {
	 System.out.println("finalise method done");
 }
}