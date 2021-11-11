package com.sapiens.DAO.dao;

import com.sapiens.DAO.model.StudentDTO;
import org.springframework.stereotype.Repository;

@Repository("studentDao")
public class StudentDAOImpl implements StudentDAO{
    @Override
    public StudentDTO createNewStudent() {
        StudentDTO e = new StudentDTO();
        e.setRollno(2);
        e.setName("Salma");
        e.setGrade("12th");
        e.setPercentage(90.8);
        return e;
    }
}
