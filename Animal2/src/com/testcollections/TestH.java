package com.testcollections;

import java.util.TreeMap;

public class TestH {

	public static void main(String[] args) {
	TreeMap map=new TreeMap();
	map.put(109, "A");
	map.put(108, "B");
	map.put(103, "C");
	map.put(106, "D");
	map.put(1017, "G");
	//map.put(null, "101"); RE:java.lang.NullPointerException
	System.out.println(map.firstKey());
	System.out.println(map.lastKey());
	System.out.println(map.headMap(106));
	System.out.println(map.tailMap(1017));
	System.out.println(map.subMap(101, 1017));
	}

}
