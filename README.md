SampleBankAccount
Overview
SampleBankAccount is a Java project designed to showcase fundamental Object-Oriented Programming (OOP) principles such as encapsulation, inheritance, and polymorphism. This project simulates basic bank account operations such as checking balances, depositing, and withdrawing funds. Additionally, it demonstrates the extension of a BankAccount into a SavingsAccount class that includes an interest rate feature.

Features
BankAccount Class:
Manages basic account information including balance and accountNumber.
Allows users to:
Deposit money with deposit(double amount).
Withdraw money with withdraw(double amount), ensuring sufficient funds.
Check current balance using checkBalance().
SavingsAccount Class:
Inherits from BankAccount.
Includes an interestRate attribute and the ability to apply interest to the account using applyInterest().
OOP Concepts Demonstrated
Encapsulation:

The balance and accountNumber attributes are private, ensuring they can only be accessed through public methods like getAccountNumber() and checkBalance().
Inheritance:

The SavingsAccount class extends the functionality of BankAccount by adding interest-related functionality while retaining all the behaviors of the base class.
Polymorphism:

Although not directly showcased, the project sets the foundation for future polymorphic behavior, where different types of accounts (e.g., checking, savings) could be treated uniformly while having unique behavior.
