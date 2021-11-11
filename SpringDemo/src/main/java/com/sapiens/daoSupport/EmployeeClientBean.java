package com.sapiens.daoSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeClientBean {

    @Autowired
    EmployeeService employeeService;

    public void run(){
        System.out.println("Persisting employee");
        com.sapiens.daoSupport.Employee employee = com.sapiens.daoSupport.Employee.create("Lozan",25,"CEO",8000);
        employeeService.saveEmployee(employee);

        employee = com.sapiens.daoSupport.Employee.create("Salma",30,"Developoer",12000);
        employeeService.saveEmployee(employee);

        List<Employee> allEmployees = employeeService.getAllEmployees();
        System.out.println("Employees Loaded: "+allEmployees);

        employee= employeeService.getEmployeeById(75);
        System.out.println("Employee Loaded by id: "+ employee);

        System.out.println("Update the Employee with id 2");
        employee.setSalary(8000);
        employeeService.updateEmployee(employee);

        System.out.println("Deleting the Employee");
        employeeService.deleteEmployee(87);

        allEmployees = employeeService.getAllEmployees();
        System.out.println("Employees Loaded: "+allEmployees);
    }
}
