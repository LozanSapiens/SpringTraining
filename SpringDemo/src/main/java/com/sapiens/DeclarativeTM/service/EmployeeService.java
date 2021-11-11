package com.sapiens.DeclarativeTM.service;

import com.sapiens.DeclarativeTM.model.Employee;

public interface EmployeeService {
    public Employee getEmployee(int empId);
    public void addEmployee(Employee emp);
}
