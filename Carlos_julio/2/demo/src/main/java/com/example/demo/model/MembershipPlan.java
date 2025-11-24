package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "membership_plan")
public class MembershipPlan {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "plan_id")
    private int id; // plan_id

    @Column(name = "plan_name", length = 80)
    private String planName;

    @Column(name = "monthly_price")
    private double monthlyPrice;

    public MembershipPlan() {}

}
