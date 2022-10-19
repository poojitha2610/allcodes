package testcolllections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		
		List<String > integers=new ArrayList<>(Arrays.asList("10","20"));
		integers.add("10");
		System.out.println(integers);
       for(String l:integers) {
    	   System.out.println(l);
       }
       for(int i=0;i<integers.size();i++)
       {
    	   System.out.println(List.get());
       }
	}

}
