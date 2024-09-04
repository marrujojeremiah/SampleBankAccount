package com.bankapp;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    // Constructor
    public SavingsAccount(String accountNumber, double initialBalance, double interestRate) {
        super(accountNumber, initialBalance);  // Call the parent constructor
        this.interestRate = interestRate;
    }

    // Method to apply interest to the balance
    public void applyInterest() {
        double interest = checkBalance() * interestRate;
        deposit(interest);
        System.out.println("Interest applied. New balance: $" + checkBalance());
    }
}
