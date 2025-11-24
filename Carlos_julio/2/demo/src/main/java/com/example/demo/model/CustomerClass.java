package com.example.demo.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "customer_class")
public class CustomerClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_customer_class")
    private int id; // id pivote

    @ManyToOne
    @JoinColumn(name = "customer_id") // FK a customer
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "class_id") // FK a group_class
    private GroupClass groupClass;

    @Column(name = "enrollment_date")
    private LocalDate enrollmentDate; // fecha_inscripcion

    public CustomerClass() {
    }

}
