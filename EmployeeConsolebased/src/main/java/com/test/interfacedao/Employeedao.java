package com.test.interfacedao;

import java.util.ArrayList;

import com.test.Model.Employee;

public interface Employeedao {
public ArrayList<Employee> displayEmployee(Employee employee);
public void addEmployee(Employee employee);
public void updateEmployee();
public void deleteEmployee();
}
