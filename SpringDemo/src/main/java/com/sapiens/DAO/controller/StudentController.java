package com.sapiens.DAO.controller;

import com.sapiens.DAO.manager.StudentManager;
import com.sapiens.DAO.model.StudentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@Controller
public class StudentController {
    @Autowired
    StudentManager manager;
    public StudentDTO createNewStudent(){
        return manager.createNewStudent();
    }
}
