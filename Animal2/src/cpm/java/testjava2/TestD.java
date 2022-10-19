package cpm.java.testjava2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class TestD {

	public static void main(String[] args)throws Exception {
		Properties p=new  Properties();
		FileInputStream fos=new FileInputStream("prop.properties");
		String s=p.getProperty("url");
		System.out.println(s);

	}

}
