package com.db.tema9.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    @Id
    @GeneratedValue
    @NotNull
    private Long id;
    private double price;

    @ManyToOne
    Customer customer;

    @OneToOne
    Payment payment;
}
