package com.java.testh;

import javax.persistence.Entity;
import javax.persistence.Table;



@Entity
@Table
public class StudentName
{
String fname;
String mname;
String lname;
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getMname() {
	return mname;
}
public void setMname(String mname) {
	this.mname = mname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
@Override
public String toString() {
	return "StudentName [fname=" + fname + ", mname=" + mname + ", lname=" + lname + "]";
}

}
