package com.sapiens.daoSupport;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private long age;
    private String desig;
    private long salary;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public String getDesig() {
        return desig;
    }

    public void setDesig(String desig) {
        this.desig = desig;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", desig='" + desig + '\'' +
                ", salary=" + salary +
                '}';
    }
    public static com.sapiens.daoSupport.Employee create(String name, long age, String desig, long salary){
        com.sapiens.daoSupport.Employee employee = new com.sapiens.daoSupport.Employee();
        employee.setName(name);
        employee.setAge(age);
        employee.setDesig(desig);
        employee.setSalary(salary);
        return employee;
    }
}
