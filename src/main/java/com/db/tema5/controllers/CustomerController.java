package com.db.tema5.controllers;

import com.db.tema5.model.Customer;
import com.db.tema5.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class CustomerController {

    @Autowired
    CustomerService customerService;
    @GetMapping("/customers")
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }
    @GetMapping("/customers/{id}")
    public Customer  getCustomerById(@PathVariable Integer id){
        return customerService.getById(id);
    }
    @PostMapping("/customers")
    public Customer createCustomer(@RequestBody Customer customer){
        customerService.insert(customer);
        return customer;
    }
    @PostMapping("/customers/update")
    public Customer updateCustomer(@RequestBody Customer customer){
        customerService.update(customer);
        return customer;
    }


}
