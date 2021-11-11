package com.sapiens.jpaApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {
    @Autowired
    private DAO dao;

    public void insertContact(Contact con){
        try{
            dao.insertContact(con);
        }catch (DataAccessException e){
            e.printStackTrace();
        }
    }
    public List<Contact> getAllContacts(){
        try{
            return dao.findAll();
        }catch (DataAccessException e){
            e.printStackTrace();
        }
        return null;
    }
    public Contact getContactById(int id){
        try{
            return dao.findByContactId(id);
        }catch (DataAccessException e){
            e.printStackTrace();
        }
        return null;
    }

    public List<Contact> getByCountry(String country){
        try{
            return dao.findByCountry(country);
        }catch (DataAccessException e){
            e.printStackTrace();
        }
        return null;
    }

    public List<Contact> getByPremium(int premium){
        try{
            return dao.findByPremiumAmount(premium);
        }catch (DataAccessException e){
            e.printStackTrace();
        }
        return null;
    }

    public List<Contact> getByInsuranceType(String type){
        try{
            return dao.findByInsuranceType(type);
        }catch (DataAccessException e){
            e.printStackTrace();
        }
        return null;
    }

    public void updateContact(Contact contact) {
        try {
            dao.update(contact);
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
    }

    public void deleteContact(int i) {
        try{
            dao.delete(i);
        }catch (DataAccessException e){
            e.printStackTrace();
        }
    }
}