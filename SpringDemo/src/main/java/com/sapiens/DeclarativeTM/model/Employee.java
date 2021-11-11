package com.sapiens.DeclarativeTM.model;

public class Employee {
    private int empid;
    private String empName;
    private int age;
    private int salary;
    private EmployeeDetails deptName;
    private PersonalInfo address;

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public EmployeeDetails getDeptName() {
        return deptName;
    }

    public void setDeptName(EmployeeDetails deptName) {
        this.deptName = deptName;
    }

    public PersonalInfo getAddress() {
        return address;
    }

    public void setAddress(PersonalInfo address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", empName='" + empName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", deptName=" + deptName +
                ", address=" + address +
                '}';
    }
}
