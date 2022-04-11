package com.db.tema5.model;


import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
public class Orders {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    @ManyToOne
    Customer customer;

    public Orders(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
