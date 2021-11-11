package com.sapiens.DAO.dao;

import com.sapiens.DAO.model.EmployeeDTO;
import org.springframework.stereotype.Repository;

@Repository("employeeDao")
public class EmployeeDAOImpl implements EmployeeDAO {

    @Override
    public EmployeeDTO createNewEmployee() {
        EmployeeDTO e = new EmployeeDTO();
        e.setId(1);
        e.setName("Lozan");
        e.setAge(23);
        e.setGender("Female");
        e.setDesignation("CEO");
        e.setQualification("BA Statistics");

        return e;
    }
}
