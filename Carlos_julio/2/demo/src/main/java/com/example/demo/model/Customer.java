package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity (name ="customer")
public class Customer {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    @Column(name = "id_Customer")
    private int id;

    @Column(name = "first_name", length = 100)
    private String name;

    public Customer() {}
}
