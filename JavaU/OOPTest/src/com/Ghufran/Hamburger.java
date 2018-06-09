package com.Ghufran;

public class Hamburger {
    private int price;
    private String bread;
    private String meat;

    private String addition1;
    private String addition2;
    private String addition3;
    private String addition4;


    public Hamburger(String bread, String meat, int price) {
        this.bread = bread;
        this.meat = meat;
        this.price = price;
    }

    public void setAddition1(String addition1) {
        this.addition1 = addition1;
    }

    public void setAddition2(String addition2) {
        this.addition2 = addition2;
    }

    public void setAddition3(String addition3) {
        this.addition3 = addition3;
    }

    public void setAddition4(String addition4) {
        this.addition4 = addition4;
    }

    public String getAddition1() {
        return addition1;
    }

    public String getAddition2() {
        return addition2;
    }

    public String getAddition3() {
        return addition3;
    }

    public String getAddition4() {
        return addition4;
    }

    public int getPrice() {
        return price;
    }

    public String getBread() {
        return bread;
    }

    public String getMeat() {
        return meat;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }
    public int totalPrice() {
        int newPrice = this.price;
        if (addition1 != null) {
            newPrice++;
        }
        if (addition2 != null) {
            newPrice++;
        }
        if (addition3 != null) {
            newPrice++;
        }
        if (addition4 != null) {
            newPrice++;
        }
        return newPrice;

    }
}
