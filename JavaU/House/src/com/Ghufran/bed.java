package com.Ghufran;

public class bed {
    public String size;

    public bed(String size) {
        size.toLowerCase();
        if(size == "queen" || size == "king" || size == "twin"){
            this.size = size;
        }
        System.out.println("Please input King, Queen or Twin");

    }

    public String getSize() {
        return size;
    }
}
