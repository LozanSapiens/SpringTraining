package com.sapiens.DeclarativeTM.daoImpl;

import com.sapiens.DeclarativeTM.dao.EmployeeDAO;
import com.sapiens.DeclarativeTM.model.Employee;
import com.sapiens.DeclarativeTM.model.EmployeeDetails;
import com.sapiens.DeclarativeTM.model.PersonalInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;


@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public Employee findEmployee(int empId) {
        final String SELECT_BY_ID_QUERY = "select emp_id, name, age, salary,"+
                "deptname, designation , qualification," +
                "address, contact,email_id "+
                "from employee emp, employee_details det, personal_info info "+
                "where emp.emp_id = det.details_id and det.details_id= info.info_id and emp.emp_id = ?";
        return this.jdbcTemplate.queryForObject(SELECT_BY_ID_QUERY,new EmployeeMapper(), empId);
    }
    private static final class EmployeeMapper implements RowMapper<Employee> {
        @Override
        public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
            Employee emp = new Employee();
            EmployeeDetails empDetails = new EmployeeDetails();
            PersonalInfo info = new PersonalInfo();

            emp.setEmpid(rs.getInt("emp_id"));
            emp.setEmpName(rs.getString("name"));
            emp.setAge(rs.getInt("age"));
            emp.setSalary(rs.getInt("salary"));

            empDetails.setDeptname("deptname");
            empDetails.setDesignation("designation");
            empDetails.setQualification("qualification");
            emp.setDeptName(empDetails);

            info.setAddress("address");
            info.setContact("contact");
            info.setEmail_id("email_id");
            emp.setAddress(info);

            return emp;
        }
    }
    @Override
    public void insertEmployee(Employee emp) {
        final String INSERT_EMP_QUERY = "insert into employee(emp_id, name, age, salary)values(?,?,?,?)";
        final String INSERT_EmpDetails_QUERY = "insert into employee_details(details_id, deptname, designation,qualification) values(?,?,?,?)";
        final String INSERT_PersonalInfo_QUERY = "insert into personal_info(info_id, address, contact,email_id) values(?,?,?,?)";

        jdbcTemplate.update(INSERT_EMP_QUERY, emp.getEmpid(), emp.getEmpName(), emp.getAge(),emp.getSalary());
        System.out.println("Employee inserted Successfully");

       jdbcTemplate.update(INSERT_EmpDetails_QUERY,emp.getEmpid(), emp.getDeptName().getDeptname(), emp.getDeptName().getDesignation(),emp.getDeptName().getQualification());
       System.out.println("Employee Details inserted successfully");

        jdbcTemplate.update(INSERT_PersonalInfo_QUERY,emp.getEmpid(), emp.getAddress().getAddress(), emp.getAddress().getContact(),emp.getAddress().getEmail_id());
        System.out.println("Person info inserted successfully");
       }
}
