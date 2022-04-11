package com.javaapp.test.repositories;

import com.javaapp.test.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    public Customer findCustomerByUser(String username);
}
