package com.db.tema5.controllers;

import com.db.tema5.model.Orders;
import com.db.tema5.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


public class OrdersController {

    @Autowired
    OrdersService ordersService;

    @GetMapping("/orders")
    public List<Orders> getAllOrders(){
        return ordersService.getAllOrders();
    }

    @GetMapping("/orders/{id}")
    public Orders getOrdersById(@PathVariable Integer id){
        return ordersService.getOrderById(id);
    }
    @PostMapping("/orders")
    public Orders createOrders(@RequestBody Orders orders){
        ordersService.insert(orders);
        return orders;
    }
    @PostMapping("/orders/update")
    public Orders updateOrders(@RequestBody Orders orders){
        ordersService.update(orders);
        return orders;
    }

}
