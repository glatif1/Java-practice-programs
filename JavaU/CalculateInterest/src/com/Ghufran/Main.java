package com.Ghufran;

public class Main {

    public static void main(String[] args) {
//        for(int i = 8; i > 1; i--){
//            System.out.println(String.format("%.2f",calculateInterest(10000.0, i)));
//        }
//        for(int i = 2; i <9; i++){
//            System.out.println(String.format("%.2f",calculateInterest(10000.0, i)));
//      }
        int counter = 0;
        for(int i = 0; i <100; i++){
            if(isPrime(i) && counter <10){
                counter++;
                System.out.println(i);
            }

        }
    }


    public static double calculateInterest(double amount, double interestRate){
        return (amount *(interestRate/100));
    }


    public static boolean isPrime(int n){
        if(n ==1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

}
