package com.jpmc.midascore.entity;

import jakarta.persistence.*;

@Entity
public class TransactionRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double amount;

    // ✅ ADD THIS
    private double incentive;

    @ManyToOne
    private UserRecord sender;

    @ManyToOne
    private UserRecord recipient;

    // REQUIRED by JPA
    public TransactionRecord() {}

    // ---- GETTERS ----
    public Long getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public double getIncentive() {
        return incentive;
    }

    public UserRecord getSender() {
        return sender;
    }

    public UserRecord getRecipient() {
        return recipient;
    }

    // ---- SETTERS ----
    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setIncentive(double incentive) {
        this.incentive = incentive;
    }

    public void setSender(UserRecord sender) {
        this.sender = sender;
    }

    public void setRecipient(UserRecord recipient) {
        this.recipient = recipient;
    }
}
