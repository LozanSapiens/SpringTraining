package com.sapiens.DeclarativeTM.dao;

import com.sapiens.DeclarativeTM.model.Employee;

public interface EmployeeDAO {
    public Employee findEmployee(int empId);
    public void insertEmployee(Employee emp);
}

