package com.sapiens.jpaApp;

import java.util.List;

public interface DAO {
    void insertContact(Contact con);
    List<Contact> findAll();
    Contact findByContactId(int id);
    List<Contact> findByCountry(String country);
    List<Contact> findByPremiumAmount(int premium);
    List<Contact> findByInsuranceType(String type);
    void update(Contact contact);
    void delete(int i);
}
