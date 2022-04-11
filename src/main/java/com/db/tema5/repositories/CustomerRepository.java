package com.db.tema5.repositories;

import com.db.tema5.model.Customer;
import com.db.tema5.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {
    public Customer getById(Integer id);
}
