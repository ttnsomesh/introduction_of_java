package com.assignment2;

abstract class Bank {
    abstract double get_rateofInterest();
    abstract String getBankName();
    abstract double getBalance();
    abstract void printDetails();
    abstract void withdrawlAmount(double amt);
    abstract void deposit(double money);
    abstract void customer_details();
    abstract String fetchDateTime();
}
