package com.example.demo.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "customer_trainer")
public class CustomerTrainer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_customer_trainer")
    
    private int id; // id pivote

    @ManyToOne
    @JoinColumn(name = "customer_id") // FK a customer
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "employee_id") // FK a employee (trainer)
    private Employee trainer;

    @Column(name = "start_date")
    private LocalDate startDate; // fecha_inicio

    public CustomerTrainer() {
    }
}
