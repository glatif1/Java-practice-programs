package com.Ghufran;

public class Main {

    public static void main(String[] args) {
        //sums up all the digits in a number ex: sumDigit(125) gives 8 because "1+2+5"
        System.out.println(sumDigits(32123));
    }
    public static int sumDigits(int number){
        if(number< 10){
            return -1;
        }
        int sum = 0;
        while(number != 0){
            int lastDig = number%10;
            number = number/10;
            sum += lastDig;
        }

        return sum;
    }
}
