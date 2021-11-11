package com.sapiens.jpaApp;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import java.util.List;

@Repository
public class ContactDaoImpl implements DAO{
    @PersistenceUnit
    private EntityManagerFactory emf;

    @Override
    public void insertContact(Contact con) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(con);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public List<Contact> findAll() {
        EntityManager em = emf.createEntityManager();
        List<Contact> contactList = em.createQuery("select t from Contact t").getResultList();
        em.close();
        return contactList;
    }

    @Override
    public Contact findByContactId(int contact_Id) {
        EntityManager em = emf.createEntityManager();
        Contact contact = em.find(Contact.class, contact_Id);
        em.close();
        return contact;
    }

    @Override
    public List<Contact> findByCountry(String country) {
        EntityManager em = emf.createEntityManager();
        List<Contact> contactList = em.createQuery("select t from Contact t where t.address.country = :column1").setParameter("column1",country).getResultList();
        em.close();
        return contactList;
    }

    @Override
    public List<Contact> findByPremiumAmount(int premium) {
        EntityManager em = emf.createEntityManager();
        List<Contact> contactList = em.createQuery("select t from Contact t where t.insurance.premium = :column1").setParameter("column1",premium).getResultList();
        em.close();
        return contactList;
    }

    @Override
    public List<Contact> findByInsuranceType(String type) {
        EntityManager em = emf.createEntityManager();
        List<Contact> contactList = em.createQuery("select t from Contact t where t.insurance.type = :column1").setParameter("column1",type).getResultList();
        em.close();
        return contactList;
    }

    @Override
    public void update(Contact contact) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(contact);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void delete(int i) {
        EntityManager em = emf.createEntityManager();
        Contact contact = em.find(Contact.class, i);
        em.getTransaction().begin();
        em.remove(contact);
        em.getTransaction().commit();
        em.close();
    }
}