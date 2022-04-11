package com.db.tema5.model;

import jdk.jfr.Enabled;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@Entity
public class Customer {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    @OneToMany
    private List<Orders> orders;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
