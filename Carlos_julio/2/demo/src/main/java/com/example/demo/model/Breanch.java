package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//sucursal
@Entity (name = "breanch")
public class Breanch {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    @Column(name ="id_Breanch")
    private int id;

    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "city", length = 100)
    private String city;

    public Breanch() {}
}
