package com.javaapp.test.controllers;

import com.javaapp.test.exception.UserAlreadyExist;
import com.javaapp.test.model.Customer;
import com.javaapp.test.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@AllArgsConstructor

public class CustomerController {
    private final CustomerService customerService;

    @GetMapping("/customers")
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }
    @GetMapping("/customers/{id}")
    public Customer  getCustomerById(@PathVariable Integer id){
        return customerService.getCustomerById(id);
    }
    @PostMapping("/customers/register")
    public String register(@RequestBody Customer customer){
        try{
            customerService.register(customer);
        } catch (UserAlreadyExist e){
            e.printStackTrace();
            return "User already registered!";
        }
        return "User registered!";
    }
    @PostMapping("/customers/login")
    public String login(@RequestBody Customer customer, HttpServletResponse response){
        if(customerService.checkCredentials(customer.getUsername(), customer.getPassword())) {
            Cookie cookie = new Cookie("userId", customer.getUsername());
            response.addCookie(cookie);
            return "Login succesful!";
        }
        return "Login unsuccesful";
    }

    @GetMapping("/customer/info_customer")
    public String printCookie(@CookieValue(name = "user", defaultValue = "notLogged") String userLogged){
        if(userLogged.equals("notLogged"))
            return "Not logged!";
        return userLogged;
    }

}
