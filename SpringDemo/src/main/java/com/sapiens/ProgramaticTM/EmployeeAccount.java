package com.sapiens.ProgramaticTM;

public class EmployeeAccount {
    int id;
    String name;
    int age;
    String desig;
    int salary;
    String contact;

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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "EmployeeAccount{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", desig='" + desig + '\'' +
                ", salary=" + salary +
                ", contact='" + contact + '\'' +
                '}';
    }
}
