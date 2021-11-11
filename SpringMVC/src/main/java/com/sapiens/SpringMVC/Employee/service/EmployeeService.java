package com.sapiens.SpringMVC.Employee.service;

import com.sapiens.SpringMVC.Employee.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findsAll();
    void addEmployee(Employee employee);
}
