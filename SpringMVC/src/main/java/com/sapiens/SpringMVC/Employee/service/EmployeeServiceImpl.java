package com.sapiens.SpringMVC.Employee.service;

import com.sapiens.SpringMVC.Employee.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    ArrayList<Employee> employees = new ArrayList<Employee>();
    @Override
    public List<Employee> findsAll() {

        employees.add(new Employee(1,"Lozan",24,"CEO", "Ba stast"));
        employees.add(new Employee(2,"Reema",25,"Developer", "Demo"));
        employees.add(new Employee(3,"Akaber",29,"C++ Developer", "BA"));
        employees.add(new Employee(4,"Salma",24,"HR", "BA"));

        return employees;
    }

    @Override
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
}
