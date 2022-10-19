package com.java.testemployee2;

import java.util.ArrayList;

public interface Employeedao 
{
  public ArrayList<Employee> displayEmployee(Employee employee);
  public void addEmployee(Employee employee);
  public void updateEmployee(String u);
  public void deEmployee(Employee employee);
}
