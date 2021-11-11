package com.sapiens.SpringMVC.studentManagement.model;


import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    private long id;
    private String firstName;
    private String lastName;
    private String grade;
    private String city;
    private double percentage;
    private String gender;
    private int age;

    public Student(){
    }

    public Student(long id, String firstName, String lastName, String grade, String city, double percentage, String gender, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.city = city;
        this.percentage = percentage;
        this.gender = gender;
        this.age = age;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "first_name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "last_name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "grade")
    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Column(name = "city")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Column(name = "percentage")
    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    @Column(name = "gender")
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Column(name = "age")
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", grade='" + grade + '\'' +
                ", city='" + city + '\'' +
                ", percentage=" + percentage +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
