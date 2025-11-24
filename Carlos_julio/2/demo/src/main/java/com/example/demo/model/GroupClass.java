package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "group_class")
public class GroupClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "class_id")
    private int id; // clase_id

    @Column(name = "class_name", length = 80)
    private String className;

    @Column(name = "level", length = 30)
    private String level;

    public GroupClass() {}
}
