package com.Ghufran;

public class Main {

    public static void main(String[] args) {
        System.out.println(numberToWords(101));
    }

    public static String numberToWords(int number){
        String wordNum="";
        if (number < 10){
            return "Invalid Value";
        }


        int numLen = getDigitCount(number);
        number = reverse(number);
        int newNumLen = getDigitCount(number);

        while(number > 0){
            int digit = number%10;
            number = number/10;
            switch (digit){
                case 0:
                    wordNum += "ZERO ";
                    break;

                case 1:
                    wordNum += "ONE ";
                    break;

                case 2:
                    wordNum += "TWO ";
                    break;

                case 3:
                    wordNum += "THREE";
                    break;

                case 4:
                    wordNum += "FOUR ";
                    break;

                case 5:
                    wordNum += "FIVE ";
                    break;

                case 6:
                    wordNum += "SIX ";
                    break;

                case 7:
                    wordNum += "SEVEN ";
                    break;

                case 8:
                    wordNum += "EIGHT ";
                    break;

                case 9:
                    wordNum += "NINE ";
                    break;
            }

        }

        for(int i = 0; i < (numLen - newNumLen); i++){
            wordNum += "ZERO ";
        }

        return wordNum;
    }
    public static int getDigitCount(int n){
        int count =0;
        while(n> 0){
            n = n/10;
            count++;
        }
        return count;
    }
    public static int reverse(int n){
        n = Math.abs(n);
        int y =0;
        while(n > 0){
            int num  = n%10;
            y= y*10 + num;
            n = n/10;
        }

        return y;
    }
}
