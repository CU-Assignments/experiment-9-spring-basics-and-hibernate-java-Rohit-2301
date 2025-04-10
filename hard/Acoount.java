package com.example.model;

import javax.persistence.*;

@Entity
public class Account {
    @Id
    private int id;

    private String name;
    private double balance;

    // Getters, Setters, Constructors, toString()
}
