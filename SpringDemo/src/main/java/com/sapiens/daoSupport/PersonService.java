package com.sapiens.daoSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private Dao<com.sapiens.daoSupport.Person> dao;
    public void savePerson(com.sapiens.daoSupport.Person person){
        try{
            dao.save(person);
        }catch (DataAccessException e){
            e.printStackTrace();
        }
    }
    public List<com.sapiens.daoSupport.Person> getAllPersons(){
        try{
            return dao.loadAll();
        }catch (DataAccessException e){
            e.printStackTrace();
        }
        return null;
    }

    public com.sapiens.daoSupport.Person getPersonById(long id){
        try{
            return dao.load(id);
        }catch (DataAccessException e){
            e.printStackTrace();
        }
        return null;
    }
    public void deletePerson(long id){
        try{
            dao.delete(id);
        }catch (DataAccessException e){
            e.printStackTrace();
        }
    }
    public void updatePerson(Person person){
        try{
            dao.update(person);
        }catch (DataAccessException e){
            e.printStackTrace();
        }
    }
}