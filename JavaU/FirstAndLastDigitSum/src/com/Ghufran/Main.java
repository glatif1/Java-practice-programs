package com.Ghufran;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(101));
    }
    public static int sumFirstAndLastDigit(int number){
        int firstDigit = number;
        int lastDig = number%10;
        int sum = 0;

        if (number< 0){
            return -1;
        }
        if(number < 10){
            return number*2;
        }

        do{
            firstDigit = firstDigit/10;
        } while(firstDigit >= 10);

        System.out.println("First " + firstDigit);
        System.out.println("Last " + lastDig);
        sum = firstDigit +lastDig;

        return sum;
    }
}
