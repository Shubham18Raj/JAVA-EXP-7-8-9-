package com.example.springhibernate;

import jakarta.persistence.*;

@Entity
@Table(name = "Account")
public class Account {
    @Id
    private int accNo;

    private String holderName;
    private double balance;

    // Getters and Setters
    public int getAccNo() { return accNo; }
    public void setAccNo(int accNo) { this.accNo = accNo; }
    public String getHolderName() { return holderName; }
    public void setHolderName(String holderName) { this.holderName = holderName; }
    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }
}

