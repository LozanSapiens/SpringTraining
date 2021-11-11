package com.sapiens.daoSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private Dao<com.sapiens.daoSupport.Employee> dao;
    public void saveEmployee(com.sapiens.daoSupport.Employee employee){
        try{
            dao.save(employee);
        }catch (DataAccessException e){
            e.printStackTrace();
        }
    }
    public List<com.sapiens.daoSupport.Employee> getAllEmployees(){
        try{
            return dao.loadAll();
        }catch (DataAccessException e){
            e.printStackTrace();
        }
        return null;
    }

    public com.sapiens.daoSupport.Employee getEmployeeById(long id){
        try{
            return dao.load(id);
        }catch (DataAccessException e){
            e.printStackTrace();
        }
        return null;
    }
    public void deleteEmployee(long id){
        try{
            dao.delete(id);
        }catch (DataAccessException e){
            e.printStackTrace();
        }
    }
    public void updateEmployee(Employee employee){
        try{
            dao.update(employee);
        }catch (DataAccessException e){
            e.printStackTrace();
        }
    }
}