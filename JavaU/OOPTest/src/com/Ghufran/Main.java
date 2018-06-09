package com.Ghufran;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger1 = new Hamburger("Crunch", "Chicken",90);
        hamburger1.setAddition1("Cheese");
        hamburger1.setAddition2("MORE");
        System.out.println("Regular Hamburger Price: " + hamburger1.totalPrice());



        HealthyBurger hamburger = new HealthyBurger("Chicken", 5);
        hamburger.setAddition1("Check");
        hamburger.setAddition5("MORE STUFF");
        System.out.println(hamburger.getAddition1());
        System.out.println(hamburger.getMeat());
        System.out.println(hamburger.getBread());
        System.out.println("Healthy Burger Price: " +hamburger.totalPrice());

        DeluxeBurger db = new DeluxeBurger("White", "Chicken");
        System.out.println(db.getAddition4());
    }

}
