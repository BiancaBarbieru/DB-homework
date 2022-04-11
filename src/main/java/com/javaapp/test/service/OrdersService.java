package com.javaapp.test.service;

import com.javaapp.test.model.Orders;
import com.javaapp.test.repositories.OrdersRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OrdersService {

    private final OrdersRepo ordersRepo;

    public Orders getOrderById(Integer id){
        return ordersRepo.getById(id);
    }

    public void addOrder(Orders orders){
        ordersRepo.save(orders);
    }

    public void deleteOrder(Orders orders){
        ordersRepo.delete(orders);
    }

    public List<Orders> getAllOrders()
    {
        return ordersRepo.findAll();
    }
}
