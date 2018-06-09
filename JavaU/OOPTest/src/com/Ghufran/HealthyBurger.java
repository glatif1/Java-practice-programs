package com.Ghufran;

public class HealthyBurger extends Hamburger {
    private String addition5;
    private String addition6;
    private int price = 5;

    public HealthyBurger( String meat, int price) {
        super("Brown Rye", meat, price);
    }

    public void setAddition5(String addition5) {
        this.addition5 = addition5;
    }

    public void setAddition6(String addition6) {
        this.addition6 = addition6;
    }

    @Override
    public int totalPrice() {
        int newPrice = super.totalPrice();

        if (addition5 != null) {
            newPrice++;
        }
        if (addition6 != null) {
            newPrice++;
        }
       return newPrice;
    }

    public String getAddition5() {
        return addition5;
    }

    public String getAddition6() {
        return addition6;
    }
}
