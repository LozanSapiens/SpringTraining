package com.sapiens.SpringMVC.empManagement.controller;

import com.sapiens.SpringMVC.empManagement.exception.ResourceNotFoundException;
import com.sapiens.SpringMVC.empManagement.model.Employee;
import com.sapiens.SpringMVC.empManagement.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;
    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }
    @GetMapping("/employees/{id}")
    public ResponseEntity<Employee> getEmployeeById(
            @PathVariable(value = "id") Long employeeId) throws ResourceNotFoundException {
        Employee employee = employeeRepository.findById(employeeId).orElseThrow(()->new ResourceNotFoundException("Employee Not Found ::" + employeeId));
        return ResponseEntity.ok().body(employee);
    }
    @PostMapping("/employees")
    public Employee createEmployee(
            @Valid
            @RequestBody Employee employee){
        return employeeRepository.save(employee);
    }
    @PutMapping("/employees/{id}")
    public ResponseEntity<Employee> updateEmployeeById(
            @PathVariable(value = "id") Long employeeId,
            @Valid @RequestBody Employee employeeDetails) throws ResourceNotFoundException{
            Employee employee = employeeRepository.findById(employeeId).orElseThrow(()->new ResourceNotFoundException("Employee Not Found ::" + employeeId));
    employee.setEmailId(employeeDetails.getEmailId());
    employee.setFirstName(employeeDetails.getFirstName());
    employee.setLastName(employeeDetails.getLastName());
    final Employee updateEmployee = employeeRepository.save(employee);
    return ResponseEntity.ok().body(updateEmployee);
    }
    @DeleteMapping("/employees/{id}")
    public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Long employeeId) throws  ResourceNotFoundException{
        Employee employee = employeeRepository.findById(employeeId).orElseThrow(()-> new ResourceNotFoundException("Employee not Found:"+employeeId));
        employeeRepository.delete(employee);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);return response;
    }
}

