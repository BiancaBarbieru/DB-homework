package com.db.tema5.repositories;

import com.db.tema5.model.OrderDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailsRepository extends CrudRepository<OrderDetails, Integer> {
    public OrderDetails getOrderDetailsById(Integer id);
}
