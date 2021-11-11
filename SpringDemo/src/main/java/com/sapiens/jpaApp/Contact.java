package com.sapiens.jpaApp;

import javax.persistence.*;

@Entity
public class Contact {
    @Id
    private int id;
    private String firstName;
    private String lastName;
    private String dob;
    private String desig;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "id")
    private Address address;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "id")
    private Insurance insurance;



    //Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getDesig() {
        return desig;
    }

    public void setDesig(String desig) {
        this.desig = desig;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob=" + dob +
                ", desig='" + desig + '\'' +
                ", address=" + address +
                ", insurance=" + insurance +
                '}';
    }
    public static Contact create(int id, String firstName, String lastName, String dob, String desig, Address add, Insurance insu) {
        Contact contact = new Contact();
        Address address = new Address();
        Insurance insurance = new Insurance();

        contact.setId(id);
        contact.setFirstName(firstName);
        contact.setLastName(lastName);
        contact.setDob(dob);
        contact.setDesig(desig);

        address.setId(add.getId());
        address.setAddress(add.getAddress());
        address.setContactNo(add.getContactNo());
        address.setEmailID(add.getEmailID());
        address.setCountry(add.getCountry());

        insurance.setId(insu.getId());
        insurance.setType(insu.getType());
        insurance.setValidTill(insu.getValidTill());
        insurance.setPremium(insu.getPremium());

        contact.setAddress(address);
        contact.setInsurance(insurance);

        return contact;
    }
}
