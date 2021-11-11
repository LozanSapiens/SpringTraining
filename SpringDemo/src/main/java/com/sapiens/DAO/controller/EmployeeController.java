package com.sapiens.DAO.controller;

import com.sapiens.DAO.manager.EmployeeManager;
import com.sapiens.DAO.model.EmployeeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("employeeController")
public class EmployeeController {
    @Autowired
    EmployeeManager manager;
    public EmployeeDTO createNewEmployee(){

    return manager.createNewEmployee();
    }
}
