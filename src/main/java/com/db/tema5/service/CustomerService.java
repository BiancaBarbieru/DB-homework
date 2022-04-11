package com.db.tema5.service;

import com.db.tema5.model.Customer;
import com.db.tema5.model.Customer;
import com.db.tema5.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    public Customer getById(Integer id){
        return customerRepository. getById(id);
    }

    public List<Customer> getAllCustomers(){
        List<Customer> customers = new ArrayList<>();
        customerRepository.findAll().iterator().forEachRemaining(customers::add);
        return customers;
    }

    public void insert(Customer customer){
        customerRepository.save(customer);
    }

    public void update(Customer customer){
        customerRepository.save(customer);
    }
    public void delete(Customer customer){
        customerRepository.delete(customer);
    }
}

