package com.javaapp.test.controllers;

import com.javaapp.test.model.Customer;
import com.javaapp.test.model.Orders;
import com.javaapp.test.repositories.OrdersRepo;
import com.javaapp.test.service.CustomerService;
import com.javaapp.test.service.OrdersService;
import lombok.AllArgsConstructor;
import org.aspectj.weaver.ast.Or;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
public class OrdersControllers {
    private final OrdersService ordersService;
    private final OrdersRepo ordersRepo;

    @GetMapping("/orders")
    public List<Orders> getAllOrders(){
        return ordersService.getAllOrders();
    }

    @GetMapping("/orders/{id}")
    public Orders getOrderById(@PathVariable Integer id){
        return ordersService.getOrderById(id);
    }

    @PostMapping("/orders")
    public void create(@RequestBody Orders orders){
        ordersService.addOrder(orders);
    }

    @DeleteMapping("/orders/{id}")
    public void delete(@PathVariable Integer id){

        ordersService.deleteOrder(ordersService.getOrderById(id));
    }

}
