package cpm.java.testjava2;

import java.util.Hashtable;

public class TestV {
public static void main(String[] args) {
	Hashtable hashtable=new  Hashtable();
    hashtable.put(new Temp(5),"A");
    hashtable.put(new Temp(2),"B");
    hashtable.put(new Temp(6),"C");
    hashtable.put(new Temp(15),"D");
    hashtable.put(new Temp(16),"E");
    System.out.println(hashtable);//{19=E, 1=A, 12=B, 31=D, 21=C}IF IT IS DEFAULT INTTIAL capacity.
}
}
class Temp{
	int i;
	 Temp(int i) {
		this.i=i;
	}
	public String toString() {
		return i+"";
		
	}
	public int hashCode() {
		return i%9;
	}
	//public int hashCode()
}