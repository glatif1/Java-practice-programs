package com.Ghufran;

public class DeluxeBurger extends Hamburger {

    public DeluxeBurger(String bread, String meat) {
        super(bread, meat,7);
        super.setAddition1("Chips");
        super.setAddition2("Soda");


    }

    @Override
    public void setAddition1(String addition1) {
        System.out.println("No additions allowed on deluxe burger!");
    }

    @Override
    public void setAddition2(String addition2) {
        System.out.println("No additions allowed on deluxe burger!");
    }


    @Override
    public void setAddition3(String addition3) {
        System.out.println("No additions allowed on deluxe burger!");
    }


    @Override
    public void setAddition4(String addition4) {
        System.out.println("No additions allowed on deluxe burger!");
    }

}
