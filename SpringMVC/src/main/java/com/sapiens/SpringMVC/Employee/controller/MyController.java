package com.sapiens.SpringMVC.Employee.controller;


import com.sapiens.SpringMVC.Employee.model.Company;
import com.sapiens.SpringMVC.Employee.model.Contact;
import com.sapiens.SpringMVC.Employee.model.Employee;
import com.sapiens.SpringMVC.Employee.service.CompanyService;
import com.sapiens.SpringMVC.Employee.service.ContactService;
import com.sapiens.SpringMVC.Employee.service.EmployeeService;
import com.sapiens.SpringMVC.Employee.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class MyController {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private EmployeeServiceImpl employeeServiceImpl;
    @Autowired
    private ContactService contactService;
    @Autowired
    private CompanyService companyService;

    @GetMapping(value="/employees")
    public List<Employee> getEmployee(){
        List<Employee> employees = employeeService.findsAll();
        return employees;
    }
    @PostMapping(path = "/employee", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Object> addEmployee(@RequestBody Employee employee) {
        Integer id = employeeService.findsAll().size() + 1;

        employee.setId(id);

        employeeService.addEmployee(employee);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(employee.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }

    @GetMapping(value="/company")
    public List<Company> getCompanies(){
        List<Company> companies = companyService.findsAll();
        return companies;
    }
    @GetMapping(value="/contact")
    public List<Contact> getContacts(){
        List<Contact> Contacts = contactService.findsAll();
        return Contacts;
    }
}
