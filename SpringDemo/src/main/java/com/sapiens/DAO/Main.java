package com.sapiens.DAO;

import com.sapiens.DAO.manager.EmployeeManagerImpl;
import com.sapiens.DAO.manager.StudentManagerImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("DAObeans.xml");

        EmployeeManagerImpl manager = context.getBean(EmployeeManagerImpl.class);
        System.out.println(manager.createNewEmployee());

        StudentManagerImpl managerStudent = context.getBean(StudentManagerImpl.class);
        System.out.println(managerStudent.createNewStudent());
    }
}
