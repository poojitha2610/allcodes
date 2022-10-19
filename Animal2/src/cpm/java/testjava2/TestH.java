package cpm.java.testjava2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class TestH {

	public static void main(String[] args) {
		ArrayList< Integer> a=new ArrayList<>();
		a.add(10);a.add(100);a.add(190);a.add(130);a.add(910);
        System.out.println(a);
        Collections.reverse(a);
        System.out.println(a);
        Collections.sort(a);
        System.out.println(a);
       System.out.println( Collections.binarySearch(a, 1000000, new temp()));
	}

}
class temp implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Integer i1=(Integer)o1;Integer i2=(Integer)o2;
		return -i1.compareTo(i2);
	}
	
}