package com.sapiens.ProgramaticTM;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
    private JdbcTemplate jdbcTemplate;
    private TransactionTemplate transactionTemplate;
    // setter and getter for TransactionTemplate
    public TransactionTemplate getTransactionTemplate() {
        return transactionTemplate;
    }
    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }
    //setter and getter for Jdbc Template
    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    //create a table
    public void createTable(){
        String query = "CREATE TABLE Employee_ACCOUNT(ID INT, NAME VARCHAR(20), AGE INT , DESIG VARCHAR(30), SALARY INT, CONTACT VARCHAR(40))";
        jdbcTemplate.execute(query);
    }
    //adding employee
    public void addEmployee(int id, String name, int age, String desig, int salary, String contact){
        String query = "INSERT INTO Employee_ACCOUNT VALUES("+id+",'"+name+"',"+age+",'"+desig+"', "+salary+",'"+contact+"');";
        jdbcTemplate.execute(query);
    }

    //    //count of data
    public int countEmployee(){
        String query = "select count(*) from Employee_ACCOUNT";
        return jdbcTemplate.queryForObject(query, Integer.class);
    }
    // extracting the  data
    public List<EmployeeAccount> getAllEmployee(){
        String query = "select * from Employee_ACCOUNT";
        return jdbcTemplate.query(query, new ResultSetExtractor<List<EmployeeAccount>>(){
            @Override
            public List<EmployeeAccount> extractData(ResultSet rs) throws SQLException, DataAccessException {
                List<EmployeeAccount> employeeAccounts = new ArrayList<EmployeeAccount>();
                while (rs.next()){
                    EmployeeAccount employeeAccount = new EmployeeAccount();
                    employeeAccount.setId(rs.getInt("id"));
                    employeeAccount.setName(rs.getString("name"));
                    employeeAccount.setAge(rs.getInt("age"));
                    employeeAccount.setDesig(rs.getString("desig"));
                    employeeAccount.setSalary(rs.getInt("salary"));
                    employeeAccount.setContact(rs.getString("contact"));
                    employeeAccounts.add(employeeAccount);
                }
                return employeeAccounts;
            }
        });
    }
    public void updatingSalary(int id, int salary){
        transactionTemplate.execute(new TransactionCallback<Object>() {
            @Override
            public Object doInTransaction(TransactionStatus status) {
                try{
                    getJdbcTemplate().update("update Employee_ACCOUNT set salary = ? where id =?", salary, id);
                }catch (Exception e){
                    status.isRollbackOnly();
                }
                return null;
            }
        });
    }
    public void updatingAge(int id, int age){
        transactionTemplate.execute(new TransactionCallback<Object>() {
            @Override
            public Object doInTransaction(TransactionStatus status) {
                try{
                    getJdbcTemplate().update("update Employee_ACCOUNT set age = ? where id =?", age, id);
                }catch (Exception e){
                    status.isRollbackOnly();
                }
                return null;
            }
        });
    }

    //delete employee
    public void deleteEmployee(int id){
        String query = "DELETE FROM Employee_ACCOUNT WHERE ID =" +id;jdbcTemplate.execute(query);
    }

//    public void depositAmount(int id, int amount){
//        transactionTemplate.execute(new TransactionCallback<Object>() {
//            @Override
//            public Object doInTransaction(TransactionStatus status) {
//                try{
//                    getJdbcTemplate().update("update Employee_ACCOUNT set amount = amount + ? where id =?", amount, id);
//                }catch (Exception e){
//                    status.isRollbackOnly();
//                }
//                return null;
//            }
//        });
//    }
//    public void withdrawAmount(int id, int salary){
//        transactionTemplate.execute(new TransactionCallback<Object>() {
//            @Override
//            public Object doInTransaction(TransactionStatus status) {
//                try{getJdbcTemplate().update("update Employee_ACCOUNT set salary = salary -? where id =?", salary, id);
//                }catch (Exception e){
//                    status.isRollbackOnly();
//                }
//                return null;
//            }
//        });
//    }
}