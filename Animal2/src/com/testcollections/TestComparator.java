package com.testcollections;

import java.util.Comparator;
import java.util.TreeSet;

public class TestComparator {
	
	public static void main(String[] args) {
		System.out.println("hello");
		TreeSet<Integer> integers=new  TreeSet<>(new  Comp());
		for(int i=0;i<5;i++) {
			integers.add( new StringBuffer(i));
		}
		System.out.println(integers);
	}

}
class Comp implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
		return -i1.compareTo(i2);
	}
	
}