package com.db.tema5.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class OrderDetails {
    @Id
    @GeneratedValue
    private int id;
    private Integer quantity;

    public OrderDetails(int id, Integer quantity) {
        this.id = id;
        this.quantity = quantity;
    }
}
