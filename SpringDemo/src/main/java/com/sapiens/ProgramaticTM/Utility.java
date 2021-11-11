package com.sapiens.ProgramaticTM;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.List;

public class Utility {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("C:\\SpringDemo\\src\\main\\resources\\Beans.xml");
        EmployeeDAO employeeDAO = context.getBean("EmployeeDAOBean", EmployeeDAO.class );
        //creating an employees
        System.out.println("Create a table");
        employeeDAO.createTable();
        System.out.println("Adding Data to Table");
        employeeDAO.addEmployee(1, "Harry", 27,"CEO",7000,"0533287");
        employeeDAO.addEmployee(2, "Scooby", 28,"CEO",10000,"09382372");
        employeeDAO.addEmployee(3, "Shaggy", 30, "Developer", 11000,"0394374");
        employeeDAO.addEmployee(4, "Scrappy", 25,"CEO",9000,"08372749");
        employeeDAO.addEmployee(5, "Lozan", 24,"CEO",5000,"0488282");
        employeeDAO.addEmployee(6, "Salma", 32,"Developer",12000,"66364");
        employeeDAO.addEmployee(7, "Marwan", 35,"Developer",16000,"09382737");
        System.out.println("Extracting the data ");
        List<EmployeeAccount> allEmployees1 = employeeDAO.getAllEmployee();
        for(EmployeeAccount customerAccount: allEmployees1){
            System.out.println("Employee ID: " + customerAccount.getId());
            System.out.println("Employee Name: "+ customerAccount.getName());
            System.out.println("Employee's Amount: "+ customerAccount.getAge());
            System.out.println("Employee's age: "+ customerAccount.getDesig());
            System.out.println("Employee's age: "+ customerAccount.getSalary());
            System.out.println("Employee's age: "+ customerAccount.getContact());
        }
        System.out.println("Count of Employees: "+ employeeDAO.countEmployee());

        //updating salary
        System.out.println("Updating salary");
        employeeDAO.updatingSalary(3,20000);
        employeeDAO.updatingSalary(6, 7000);
        System.out.println("Extracting the data ");
        List<EmployeeAccount> allEmployees2 = employeeDAO.getAllEmployee();
        for(EmployeeAccount customerAccount: allEmployees2){
            System.out.println("Employee ID: " + customerAccount.getId());
            System.out.println("Employee Name: "+ customerAccount.getName());
            System.out.println("Employee's Amount: "+ customerAccount.getAge());
            System.out.println("Employee's age: "+ customerAccount.getDesig());
            System.out.println("Employee's age: "+ customerAccount.getSalary());
            System.out.println("Employee's age: "+ customerAccount.getContact());
        }

        //updating age
        System.out.println("Updating age");
        employeeDAO.updatingAge(2,30);
        employeeDAO.updatingAge(5, 29);
        System.out.println("Extracting the data ");
        List<EmployeeAccount> allEmployees3 = employeeDAO.getAllEmployee();
        for(EmployeeAccount customerAccount: allEmployees3){
            System.out.println("Employee ID: " + customerAccount.getId());
            System.out.println("Employee Name: "+ customerAccount.getName());
            System.out.println("Employee's Amount: "+ customerAccount.getAge());
            System.out.println("Employee's age: "+ customerAccount.getDesig());
            System.out.println("Employee's age: "+ customerAccount.getSalary());
            System.out.println("Employee's age: "+ customerAccount.getContact());
        }

        System.out.println("--------Count of Employees before resignation of 1st employee: "+ employeeDAO.countEmployee());
        System.out.println("Deleting a customer");employeeDAO.deleteEmployee(1);
        System.out.println("Extracting the data ");
        List<EmployeeAccount> allEmployees4 = employeeDAO.getAllEmployee();
        for(EmployeeAccount customerAccount: allEmployees4){
            System.out.println("Employee ID: " + customerAccount.getId());
            System.out.println("Employee Name: "+ customerAccount.getName());
            System.out.println("Employee's Amount: "+ customerAccount.getAge());
            System.out.println("Employee's age: "+ customerAccount.getDesig());
            System.out.println("Employee's age: "+ customerAccount.getSalary());
            System.out.println("Employee's age: "+ customerAccount.getContact());
        }

        System.out.println("--------Count of Employees after resignation of 1st employee:"+ employeeDAO.countEmployee());

    }
}