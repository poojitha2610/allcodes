package com.testcollections;

import java.util.Comparator;
import java.util.TreeSet;

public class test1 {
	public static void main(String[] args) {
		System.out.println("hello");
		TreeSet<StringBuffer> integers=new  TreeSet<>();
		
			integers.add(new StringBuffer("10"));
			integers.add(new StringBuffer("200"));
			integers.add(new StringBuffer("30"));
		
		System.out.println(integers);
	}

}
//class Comp implements Comparator{
//
//	@Override
//	public int compare(Object o1, Object o2) {
//		Integer i1=(Integer)o1;
//		Integer i2=(Integer)o2;
//		return -i1.compareTo(i2);
//	}
//	
//}   