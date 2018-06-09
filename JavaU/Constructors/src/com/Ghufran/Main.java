package com.Ghufran;

public class Main {

    public static void main(String[] args) {
        BankAccount me = new BankAccount();
        BankAccount newMe = new BankAccount(122,333, 3134, "this", "That");
        me.setCustomerName("BLUE");
        me.deposit(1000);
        me.setAccoutNumber(12345321);
        me.setBalance(150);
        me.withdraw(149);
        System.out.println(me.getBalance());
        BankAccount newAcc = new BankAccount(123, "me@gmail.com", "more email");
        System.out.println(newAcc.getAccoutNumber());

        VipCustomer VIPP= new VipCustomer("Yello");
        System.out.println(VIPP.getCreditLimit());
    }
}
