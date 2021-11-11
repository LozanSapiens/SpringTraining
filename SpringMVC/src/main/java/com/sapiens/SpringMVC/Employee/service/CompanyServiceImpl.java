package com.sapiens.SpringMVC.Employee.service;

import com.sapiens.SpringMVC.Employee.model.Company;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService{

    @Override
    public List<Company> findsAll() {
        ArrayList<Company> companies = new ArrayList<Company>();

        companies.add(new Company("Sapiens","insurance"));
        companies.add(new Company("Zara","Clothes"));

        return companies;
    }
}
