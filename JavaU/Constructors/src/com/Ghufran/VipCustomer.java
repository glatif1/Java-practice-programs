package com.Ghufran;

public class VipCustomer {
    private String name;
    private String creditLimit;
    private String emailAddress;

    public VipCustomer(String name, String creditLimit, String emailAddress){
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }
    public VipCustomer(String name, String creditLimit){
        this(name, creditLimit, "empty");
    }
    public VipCustomer(String name){
        this(name, "nA", "empty");
    }
    public VipCustomer(){
        this("n0ne", "nA", "empty");
    }

    //GETTERS
    public String getName() {
        return name;
    }

    public String getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

}
