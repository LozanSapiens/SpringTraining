package com.sapiens.DeclarativeTM.config;


import com.sapiens.DeclarativeTM.model.Employee;
import com.sapiens.DeclarativeTM.model.EmployeeDetails;
import com.sapiens.DeclarativeTM.model.PersonalInfo;
import com.sapiens.DeclarativeTM.service.EmployeeService;
import com.sapiens.DeclarativeTM.serviceImpl.EmployeeServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        EmployeeService employeeService = context.getBean("employeeServiceImpl", EmployeeServiceImpl.class);
        employeeService.addEmployee(createEmployee());
        employeeService.getEmployee(100);
        context.registerShutdownHook();
    }
    @org.jetbrains.annotations.NotNull
    private static Employee createEmployee() {
        Employee employee = new Employee();
        EmployeeDetails employeeDetails = new EmployeeDetails();
        PersonalInfo personalInfo = new PersonalInfo();

        employee.setEmpid(100);
        employee.setEmpName("Lozan");
        employee.setAge(24);
        employee.setSalary(8000);

        employeeDetails.setDetailsid(employee.getEmpid());
        employeeDetails.setDeptname("L and P");
        employeeDetails.setDesignation("CEO");
        employeeDetails.setQualification("BA");
        employee.setDeptName(employeeDetails);

        personalInfo.setInfoid(employee.getEmpid());
        personalInfo.setAddress("Israel");
        personalInfo.setContact("05383828");
        personalInfo.setEmail_id("lozan@gmail.com");
        employee.setAddress(personalInfo);

        return employee;
    }
}
