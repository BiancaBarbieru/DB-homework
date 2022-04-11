package com.db.tema5.repositories;

import com.db.tema5.model.Orders;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepository extends CrudRepository<Orders, Integer> {
    public Orders getOrdersById(Integer id);
}
