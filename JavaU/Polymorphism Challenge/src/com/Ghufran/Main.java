package com.Ghufran;

public class Main {

    public static void main(String[] args) {
        porsche porsche= new porsche();
        porsche.accelerate(5);
        tesla tesla = new tesla();
        tesla.startEngine();
        tesla.accelerate(4);
        System.out.println(tesla.getName());

    }


}
