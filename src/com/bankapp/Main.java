package com.bankapp;

public class Main {
    public static void main(String[] args) {
        // Create a bank account
        BankAccount account = new BankAccount("12345", 1000.0);

        // Test: Check initial balance
        System.out.println("Initial balance: $" + account.checkBalance());

        // Test: Deposit money
        account.deposit(200.0);

        // Test: Withdraw money
        account.withdraw(150.0);

        // Test: Attempt to withdraw too much money
        account.withdraw(2000.0);

        // savings account with an interest rate of 5%
        SavingsAccount savings = new SavingsAccount("67890", 2000.0, 0.05);

        // Test: Check initial balance in the savings account
        System.out.println("Initial balance in savings: $" + savings.checkBalance());

        // Test: Apply interest
        savings.applyInterest();
    }
}
