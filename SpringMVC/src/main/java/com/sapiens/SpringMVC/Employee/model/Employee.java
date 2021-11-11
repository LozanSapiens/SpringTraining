package com.sapiens.SpringMVC.Employee.model;

public class Employee {

    private int id;
    private String name;
    private int age;
    private String desig;
    private String qualification ;

    public Employee(int id, String name, int age, String desig, String qualification) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.desig = desig;
        this.qualification = qualification;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDesig() {
        return desig;
    }

    public void setDesig(String desig) {
        this.desig = desig;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", desig='" + desig + '\'' +
                ", qualification='" + qualification + '\'' +
                '}';
    }
}
