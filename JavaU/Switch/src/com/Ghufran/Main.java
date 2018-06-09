package com.Ghufran;

import java.util.WeakHashMap;

public class Main {

    public static void main(String[] args) {
        char SwitchValue = 'A';
        switch (SwitchValue){
            case 'A':
                System.out.println("Value A");
                break;
            case 'B':
                System.out.println("Value B");
                break;
            case 'C':
                System.out.println("Value C");
                break;
            case 'D':
                System.out.println("Value D");
                break;
            case 'E':
                System.out.println("Value E");
                break;
            default:
                System.out.println("Was A, B, C, D, or E");
                break;
        }
        String month = "January";
        switch(month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not Sure");
        }



    }

}
