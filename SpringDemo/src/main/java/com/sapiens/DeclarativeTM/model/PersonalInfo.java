package com.sapiens.DeclarativeTM.model;

public class PersonalInfo {
    private int infoid;
    private String address;
    private String contact;
    private String email_id;

    public int getInfoid() {
        return infoid;
    }

    public void setInfoid(int infoid) {
        this.infoid = infoid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    @Override
    public String toString() {
        return "PersonalInfo{" +
                "infoid=" + infoid +
                ", address='" + address + '\'' +
                ", contact='" + contact + '\'' +
                ", email_id='" + email_id + '\'' +
                '}';
    }
}
