package com.sapiens.SpringMVC.empManagement.repository;

import com.sapiens.SpringMVC.empManagement.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}