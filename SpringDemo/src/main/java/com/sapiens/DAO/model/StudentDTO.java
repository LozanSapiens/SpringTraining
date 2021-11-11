package com.sapiens.DAO.model;


public class StudentDTO {
    private Integer rollno;
    private String name;
    private String grade;
    private Double percentage;

    public Integer getRollno() {
        return rollno;
    }

    public void setRollno(Integer rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", percentage=" + percentage +
                '}';
    }
}
