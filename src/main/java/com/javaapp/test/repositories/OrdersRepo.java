package com.javaapp.test.repositories;

import com.javaapp.test.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OrdersRepo extends JpaRepository<Orders, Integer> {
}
