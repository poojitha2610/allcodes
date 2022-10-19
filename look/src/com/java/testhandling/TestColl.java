package com.java.testhandling;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.Vector;



public class TestColl {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Integer>integers=new ArrayList<>(Arrays.asList(10,20,30,49,50));
		//SortedSet<Integer> s= {10,20};
		Vector<Integer> v=new Vector<>(100      );
		LinkedList<Integer>integers2=new LinkedList<>();
		HashSet<Integer> u=new HashSet<>(10,85);//(capacity,fill ratio)
		System.out.println("operations 1.insertion 2.convert arraylist to linkedlist 3.arraylist operartions 4.capacity of vectot 5.hashset");
		System.out.println("enter the choice");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
//			for(int i=0;i<integers.size();i++) //retrieval oprartion best for arraylisr
//			{
//				System.out.println(integers.get(i));
//			};break;
			ListIterator<Integer> o=integers.listIterator();
			//System.out.println(o.hasPrevious());
		case 2:
			//convert arraylist to linkedlist
			for(int i=0;i<integers.size();i++) {
				integers2.add(integers.get(i));
			}
			System.out.println(integers2);break;
		case 3:
			System.out.println("arrayslist operations ");
			System.out.println(" add method "+integers.add(10));
			//System.out.println(integers.add(1, null));
			System.out.println(" contains method "+integers.contains(integers2));
			System.out.println(" addall method "+integers.addAll(integers2));
			System.out.println(" hashcode method "+integers.hashCode());
			System.out.println(" equals method "+integers.equals(integers2));
			System.out.println(" indexof method "+integers.indexOf(10));
			System.out.println(" remove(object) method "+integers.remove(3));
			System.out.println(" isEmpty method "+integers.isEmpty());
			System.out.println(" lastIndexOf method "+integers.lastIndexOf(150));
			System.out.println(" size method "+integers.size());
			System.out.println(" removeall method "+integers.removeAll(integers2));
			System.out.println(" tostring method "+integers.toString());
			System.out.println();
			break;
			//System.out.println();
		case 4:
			System.out.println("vector oprartions");
			System.out.println(v.capacity());break;
		case 5:
		u.add(10);
		System.out.println(u.addAll(integers2));
		Iterator<Integer> iteable=u.iterator();
		while(iteable.hasNext()) {
			System.out.println(iteable.next());
		};break;
	
			
		}
	}

}
