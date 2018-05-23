package com.company;

public class Main {

    public static void main(String[] args) {

        byte byteNum = 127;

        short shortNum = 32000;

        int intNum = 2;

        long longNum = 50000 + 10*(shortNum+byteNum+intNum);

        System.out.println(longNum);

    }
}
