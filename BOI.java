package com.assignment2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BOI extends Bank{

    private long account_number;
    private double balance;
    private String name;
    private AccountTYpe account_type;


    public BOI(long account_number , String name , AccountTYpe account_type){
        this.account_number = account_number;
        this.name = name;
        this.account_type = account_type;
        balance = 5000;
    }

    public long getAccount_number() {
        return account_number;
    }

    public void setAccount_number(long account_number) {
        this.account_number = account_number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AccountTYpe getAccount_type() {
        return account_type;
    }

    public void setAccount_type(AccountTYpe account_type) {
        this.account_type = account_type;
    }

    @Override
    double get_rateofInterest() {
        return 4.25;
    }

    @Override
    String getBankName() {
        return "Bank of India";
    }

    @Override
    double getBalance() {
        return balance;
    }

    @Override
    void printDetails() {
        System.out.println("Bank name : BOI");
        System.out.println("Interest Rate : "+get_rateofInterest());
    }

    @Override
    void withdrawlAmount(double amt) {
        try{
            if((balance - amt) < 0){
                throw new Exception("not sufficient balance");
            }else{
                balance = balance - amt;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    void deposit(double money) {
        balance += money;
    }

    @Override
    void customer_details() {
        printDetails();
        System.out.println("Customer Name : "+this.name);
        System.out.println("Balance : "+this.balance);
        System.out.println("Account type : "+this.account_type);
        System.out.println("Account number : "+this.account_number);
    }

    @Override
    String fetchDateTime() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }
}
