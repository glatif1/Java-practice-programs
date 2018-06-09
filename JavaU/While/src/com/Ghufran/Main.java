package com.Ghufran;

public class Main {

    public static void main(String[] args) {
//        int count = 1;
//
//
//        while (count != 6){
//            System.out.println(count);
//            count++;
//        }
//        count =1;
//        do {
//            System.out.println("Count value was " + count);
//            count++;
//            if(count > 100)
//                break;
//        }while(count < 6);

        int number = 4;
        int finishNumber =20;
        int sum = 0;
        int counter = 0;
        while((number <= finishNumber) && counter < 5){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            counter++;
            sum+=number;
            System.out.println("Even Number " + number);
        }
        System.out.println("Sum is " + sum);
    }

    public static boolean isEvenNumber(int n){
        if(n%2 ==0){
            return true;
        }
        return false;
    }

}
