package com.Ghufran;

public class addition {
    private String ingredient;
    private int counter = 0;


    public addition(String ingredient) {
        this.ingredient = ingredient;
    }
    public addition(){
        this("");
    }

    public void setIngredient(String ingredient) {

        this.ingredient += " "+ ingredient;
    }


    public String getIngredient() {
        return ingredient;
    }
}
