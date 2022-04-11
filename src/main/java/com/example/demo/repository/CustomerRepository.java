package com.example.demo.repository;

import com.example.demo.dao.CustomerDAO;
import com.example.demo.model.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository <CustomerDAO, Integer>{
    public List<Customer> findByCity(String city);
    public List<Customer> findByCountry(String country);
}
