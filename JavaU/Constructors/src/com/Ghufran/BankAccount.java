package com.Ghufran;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class BankAccount {
    private int accoutNumber;
    private int balance;
    private int phoneNumber;
    private String customerName;
    private String email;
    public BankAccount(){
        System.out.println("Empty Account Info");
    }
    public BankAccount(int accoutNumber,int balance, int phoneNumber, String customerName, String email){
        this.accoutNumber = accoutNumber;
        this.balance = balance;
        this.phoneNumber = phoneNumber;
        this.customerName = customerName;
        this.email = email;
    }

    public BankAccount(int phoneNumber, String customerName, String email) {
        this(999999, 15, phoneNumber ,customerName, email);
        this.phoneNumber = phoneNumber;
        this.customerName = customerName;
        this.email = email;
    }

    // SETTERS
    public void setAccoutNumber(int accoutNumber){
        this.accoutNumber= accoutNumber;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }
    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;

    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public void setEmail(String email){
        this.email = email;
    }


    // GETTERS

    public int getAccoutNumber() {
        return accoutNumber;
    }

    public int getBalance() {
        return balance;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String  withdraw(int amount){
        if(this.balance - amount > 0){
            this.balance = this.balance - amount;
        }
        return "Error";
    }
    public String deposit(int amount){
        this.balance = this.balance + amount;
        return "Complete";
    }


}
