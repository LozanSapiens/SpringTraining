package com.sapiens.SpringMVC.Employee.model;

public class Company {
    private String name;
    private String dec;

    public Company(String name, String dec) {
        this.name = name;
        this.dec=dec;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDec() {
        return dec;
    }

    public void setDec(String dec) {
        this.dec = dec;
    }

    @Override
    public String toString() {
        return "ComapnyDetails{" +
                "name='" + name + '\'' +
                ", dec='" + dec + '\'' +
                '}';
    }
}
