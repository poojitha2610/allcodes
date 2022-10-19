
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TestB {

	public static void main(String[] args) {

	        StringBuffer one = new StringBuffer("one");
	        StringBuffer  two = new StringBuffer("two");
	        StringBuffer three = new StringBuffer("three");
	        Set <StringBuffer> sb=new TreeSet<StringBuffer>();
	        sb.add(one);
	        sb.add(two);
	        sb.add(three);
	        System.out.println("set before change: "+ sb);
	        one.append("onemore");
	        System.out.println("set After change: "+ sb);
	    }
//		set.add("boo");
//		set.add("mom");
//		set.add("papa");
		
	}


class Comp implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String i1=(String )o1;
		String  i2=(String )o2;
		return -i1.compareTo(i2);
	}
	
}