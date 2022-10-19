package com.java.testh;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student 
{

  int id;
  StudentName name;
  int marks;
  @Id
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
@Column(name="name")
public StudentName getName() {
	return name;
}
public void setName(StudentName name) {
	this.name = name;
}
@Column(name="marks")
public int getMarks() {
	return marks;
}

public void setMarks(int marks) {
	this.marks = marks;
}
  
}
