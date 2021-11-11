package com.sapiens.jpaApp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {
    @Id
    private int id;
    private String address;
    private String contactNo;
    private String emailID;
    private String country;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", contactNo='" + contactNo + '\'' +
                ", emailID='" + emailID + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}