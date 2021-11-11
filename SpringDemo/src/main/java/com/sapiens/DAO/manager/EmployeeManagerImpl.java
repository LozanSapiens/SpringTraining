package com.sapiens.DAO.manager;

import com.sapiens.DAO.dao.EmployeeDAO;
import com.sapiens.DAO.model.EmployeeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("employeeManager")
public class EmployeeManagerImpl implements EmployeeManager {
    @Autowired
    EmployeeDAO dao;
    @Override
    public EmployeeDTO createNewEmployee() {
        return dao.createNewEmployee();
    }
}


