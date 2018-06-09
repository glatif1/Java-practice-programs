package com.Ghufran;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(12321));

    }
    //checks if number is palindrome ex: if 123 !=321
    public static boolean isPalindrome(int number){
        number = Math.abs(number);
        int n = number;
        int reverse=0;
        while (number>0){
            int lastDigit = number%10;
            number = number/10;
            reverse = reverse * 10 +lastDigit;
        }
        if (n == reverse){
            return true;
        }
        return false;
    }

    //just another way to solve the same problem with helper function using String
//    public static int reverse(int n){
//        String reverse ="";
//        while (n > 0){
//            int lastDig = n%10;
//            n = n/10;
//           reverse += lastDig;
//        }
//        return Integer.parseInt(reverse);
//    }
//    public static boolean isPalindrome(int n){
//        if(n == reverse(n)){
//            return true;
//        }
//        return false;
//    }



}
