package com.db.tema5.service;


import com.db.tema5.model.Orders;
import com.db.tema5.repositories.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrdersService {
    @Autowired
    OrdersRepository ordersRepository;

    public Orders getOrderById(Integer id){
        return ordersRepository.getOrdersById(id);
    }

    public List<Orders> getAllOrders(){
        List<Orders> orders = new ArrayList<>();
        ordersRepository.findAll().iterator().forEachRemaining(orders::add);
        return orders;
    }

    public void insert(Orders orders){
        ordersRepository.save(orders);
    }
    public void update(Orders orders){
        ordersRepository.save(orders);
    }
    public void delete(Orders orders){
        ordersRepository.delete(orders);
    }

}
