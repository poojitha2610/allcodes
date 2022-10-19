package cpm.java.testjava2;

import java.util.PriorityQueue;

public class TestF {

	public static void main(String[] args) {
	PriorityQueue q=new PriorityQueue();
	int cap=10;
	for(int i=0;i<cap;i++) {
		q.offer(i);
	}
	System.out.println(q);
	System.out.println(q.peek());
	System.out.println(q.poll());//remove head element
	System.out.println(q);
	System.out.println(q.remove());//remove last element
	System.out.println(q);
	}

}
