package com.sapiens.jpaApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ContactClientBean {
    @Autowired
    ContactService contactService;
    public void run(){
//        System.out.println("Persisting Contact");
//
//        Address address = new Address();
//        address.setId(80);
//        address.setAddress("DVC");
//        address.setContactNo("049294");
//        address.setEmailID("R@example.com");
//        address.setCountry("India");
//
//        Insurance insurance = new Insurance();
//        insurance.setId(80);
//        insurance.setType("NON Life");
//        insurance.setValidTill("2040");
//        insurance.setPremium(250);
//
//        Contact contact = Contact.create(80, "Reema", "Da", "09/09/1994","Java Developer", address, insurance);
//        contactService.insertContact(contact);



        List<Contact> allContacts = contactService.getAllContacts();
        System.out.println("Contacts Loaded: "+allContacts);


        Contact contact = contactService.getContactById(90);
        System.out.println("Contact Loaded by id: "+ contact);

        allContacts = contactService.getByCountry("Israel");
        System.out.println("Contacts Loaded by country : " +allContacts);

        allContacts = contactService.getByPremium(500);
        System.out.println("Contacts Loaded by premium : " +allContacts);

        allContacts = contactService.getByInsuranceType("Life");
        System.out.println("Contacts Loaded by Insurance Type : " +allContacts);

        System.out.println("Update the Contact with id 67 ");
        contact.setDesig("CEO");
        contactService.updateContact(contact);

        System.out.println("Deleting the Contact");
        contactService.deleteContact(90);

        allContacts = contactService.getAllContacts();
        System.out.println("Contacts Loaded: "+allContacts);

    }
}