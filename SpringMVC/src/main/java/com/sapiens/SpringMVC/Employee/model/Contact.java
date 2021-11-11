package com.sapiens.SpringMVC.Employee.model;

public class Contact {
    private String mobile;
    private String address;
    private String email;
    private String website;

    public Contact(String mobile, String address, String email, String website) {
        this.mobile = mobile;
        this.address = address;
        this.email = email;
        this.website = website;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "mobile='" + mobile + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", website='" + website + '\'' +
                '}';
    }
}
