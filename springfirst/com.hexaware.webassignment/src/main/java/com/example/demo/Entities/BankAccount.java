package com.example.demo.Entities;



import jakarta.persistence.Entity;

import jakarta.persistence.Id;

@Entity
public class BankAccount {

    @Id
    private int accountNumber;
    private String name;
    private double balance;
    private String email;

//	public BankAccount(String name, double balance, String email) {
//        this.name = name;
//        this.balance = balance;
//        this.email = email;
//    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + ", email="
				+ email + "]";
	}

}

