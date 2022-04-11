package com.javaapp.test.service;

import com.javaapp.test.exception.UserAlreadyExist;
import com.javaapp.test.model.Customer;
import com.javaapp.test.model.Orders;
import com.javaapp.test.repositories.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    public Customer getCustomerById(Integer id) {
        return customerRepository.getById(id);
    }

    public void deleteCustomer(Customer customer) {
        customerRepository.delete(customer);
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public boolean checkUser(String user) {
        return customerRepository.findCustomerByUser(user) != null;
    }

    public void register(Customer customer) throws UserAlreadyExist {
        if(checkUser(customer.getUsername())) throw new UserAlreadyExist();
        customerRepository.save(customer);
    }

    public boolean checkCredentials(String user, String pwd){
        if(customerRepository.findCustomerByUser(user) != null)
            return customerRepository.findCustomerByUser(user).getUsername().equals(user) &&
                    customerRepository.findCustomerByUser(user).getPassword().equals(pwd);
        return false;
    }

}

