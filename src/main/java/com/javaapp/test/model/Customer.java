package com.javaapp.test.model;

import jdk.jfr.Enabled;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity
public class Customer {
    @Id
    @GeneratedValue
    private Integer id;
    private String city;
    private String cuntry;
    private String username;
    private String password;
    @OneToMany
    private List<Orders> orders;

    public Customer(){}

    public Customer(Integer id, String city, String cuntry, String username, String password, List<Orders> orders) {
        this.id = id;
        this.city = city;
        this.cuntry = cuntry;
        this.username = username;
        this.password = password;
        this.orders = orders;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCuntry() {
        return cuntry;
    }

    public void setCuntry(String cuntry) {
        this.cuntry = cuntry;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
