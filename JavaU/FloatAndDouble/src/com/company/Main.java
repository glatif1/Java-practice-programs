package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inputPounds = new Scanner(System.in);
        System.out.println("Enter pounds: ");
	    double pounds = inputPounds.nextDouble();
        inputPounds.close();
        double kg =  pounds*.45359237;
        System.out.println("Kg = " +kg);
    }
}
