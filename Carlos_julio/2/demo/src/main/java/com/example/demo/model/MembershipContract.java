package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "membership_contract")
public class MembershipContract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contract_id")
    private int id; // contrato_id

    @ManyToOne
    @JoinColumn(name = "customer_id") // FK cliente
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "plan_id") // FK plan
    private MembershipPlan plan;

    public MembershipContract() {}
}
