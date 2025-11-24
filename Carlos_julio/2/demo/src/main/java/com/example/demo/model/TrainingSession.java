package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "training_session")
public class TrainingSession {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "session_id")
    private int id; // sesion_id

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee trainer;

    @Column(name = "date")
    private java.sql.Date date;

    public TrainingSession() {
        
    }
}
