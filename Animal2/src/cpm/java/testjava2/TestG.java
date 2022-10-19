package cpm.java.testjava2;

import java.util.TreeSet;

public class TestG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  TreeSet< Integer> t=new  TreeSet<>();
  t.add(1000);
  t.add(6000); t.add(1900); t.add(1070); t.add(1890);
  System.out.println(t);
  System.out.println(t.ceiling(1070));
  System.out.println(t.higher(2000));
  System.out.println(t.floor(3000));
  System.out.println(t.lower(3000));
  System.out.println(t.pollFirst()+"\n"+t.pollLast()+"\n"+t+"\n"+t.descendingSet());
  
	}

}
