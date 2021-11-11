package com.sapiens.DAO.manager;


import com.sapiens.DAO.dao.StudentDAO;
import com.sapiens.DAO.model.StudentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("studentManager")
public class StudentManagerImpl implements StudentManager{
    @Autowired
    StudentDAO dao;

    @Override
    public StudentDTO createNewStudent() {
        return dao.createNewStudent();
    }
}
