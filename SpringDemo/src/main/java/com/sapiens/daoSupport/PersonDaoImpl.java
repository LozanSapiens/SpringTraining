package com.sapiens.daoSupport;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import java.util.List;

@Repository
public class PersonDaoImpl implements Dao<com.sapiens.daoSupport.Person> {
    @PersistenceUnit
    private EntityManagerFactory emf;
    @Override
    public void save(com.sapiens.daoSupport.Person person) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(person);
        em.getTransaction().commit();
        em.close();
    }
    @Override
    public com.sapiens.daoSupport.Person load(long id) {
        EntityManager em = emf.createEntityManager();
        com.sapiens.daoSupport.Person person = em.find(com.sapiens.daoSupport.Person.class, id);
        em.close();
        return person;
    }
    @Override
    public void delete(long id) {
        EntityManager em = emf.createEntityManager();
        com.sapiens.daoSupport.Person person = em.find(com.sapiens.daoSupport.Person.class, id);
        em.getTransaction().begin();
        em.remove(person);
        em.getTransaction().commit();
        em.close();
    }
    @Override
    public void update(com.sapiens.daoSupport.Person person) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(person);
        em.getTransaction().commit();
        em.close();
    }
    @Override
    public List<com.sapiens.daoSupport.Person> loadAll() {
        EntityManager em = emf.createEntityManager();
        List <Person> personList = em.createQuery("select t from Person t").getResultList();
        em.close();
        return personList;
    }
}
