package com.sapiens.SpringMVC.Employee.service;

import com.sapiens.SpringMVC.Employee.model.Contact;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ContactServiceImpl implements ContactService{
    @Override
    public List<Contact> findsAll() {
        ArrayList<Contact> contacts = new ArrayList<Contact>();

        contacts.add(new Contact("0845384","ABC","l@gmail.com","www.l.com"));
        contacts.add(new Contact("059393","BCD","r@gmail.com","www.r.com"));
        contacts.add(new Contact("037374","DEF","s@gmail.com","www.s.com"));

        return contacts;
    }
}
