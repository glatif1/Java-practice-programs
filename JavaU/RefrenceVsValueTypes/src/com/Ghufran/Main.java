package com.Ghufran;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("MyIntVal = " + myIntValue);
        System.out.println("AnotherIntVal = " + anotherIntValue);

        anotherIntValue++;

        System.out.println("MyIntVal = " + myIntValue);

        System.out.println("AnotherIntVal = " + anotherIntValue);

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("MyIntArray= " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        anotherArray[0] =1;

        System.out.println("after MyIntArray= " + Arrays.toString(myIntArray));
        System.out.println("after anotherArray= " + Arrays.toString(anotherArray));
        anotherArray = new int[]{4,5,6,7,8};
        modifyArray(myIntArray);

        System.out.println("after modify MyIntArray= " + Arrays.toString(myIntArray));
        System.out.println("after modify anotherArray= " + Arrays.toString(anotherArray));

    }
    private static void modifyArray(int[] array){

        array[0] = 2;
        array = new int[]{1,2,3,4,5};
    }
}
