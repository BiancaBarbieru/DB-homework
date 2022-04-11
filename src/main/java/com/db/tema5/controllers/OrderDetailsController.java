package com.db.tema5.controllers;


import com.db.tema5.model.OrderDetails;
import com.db.tema5.service.OrderDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class OrderDetailsController {
    @Autowired
    OrderDetailsService orderDetailsService;

    @GetMapping("/orderDetails")
    public List<OrderDetails> getAllOrderDetails(){
        return orderDetailsService.getAllOrderDetails();
    }
    @GetMapping("/orderDetails/{id}")
    public OrderDetails  getOrderDetailsById(@PathVariable Integer id){
        return orderDetailsService.getOrderDetailsById(id);
    }
    @PostMapping("/orderDetails")
    public OrderDetails createCustomer(@RequestBody OrderDetails orderDetails){
        orderDetailsService.insert(orderDetails);
        return orderDetails;
    }
    @PostMapping("/orderDetails/update")
    public OrderDetails updateCustomer(@RequestBody OrderDetails orderDetails){
        orderDetailsService.update(orderDetails);
        return orderDetails;
    }
}
