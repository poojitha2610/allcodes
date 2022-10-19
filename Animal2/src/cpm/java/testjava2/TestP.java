package cpm.java.testjava2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class TestP {

	public static void main(String[] args) throws Exception {
	 Properties properties=new Properties();
	 FileInputStream fis =new FileInputStream("prop.properties");
	 //properties.load(fis);
	 System.out.println(properties);
	 properties.setProperty("url","jdbc:mysql://localhost:3306/pig");
	 properties.setProperty("user", "root");
	 properties.setProperty("pwd", "root");
	 String s= properties.getProperty("url");System.out.println(s);
	FileOutputStream fos =new FileOutputStream("user.properties");
	 properties.store(fos, null);

	}

}
 