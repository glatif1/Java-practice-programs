package com.Ghufran;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    int[] myArray = setArray(5);
    printArray(sortIntegers(myArray));
    System.out.println("Finished Sorting");

    }
    public static void printArray(int[] array){
        for(int value: array){
            System.out.println(value);
        }
    }

    public static int[] setArray(int number){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int[] values = new int[number];
        for(int i = 0; i< values.length; i++){
            values[i] = sc.nextInt();
            System.out.println("Value Added");
        }
        System.out.println("Done!");
        sc.close();
        return values;
    }

    public static int[] sortIntegers(int[] array){
//        int[] sortedArray = new int[array.length];
//        for(int i = 0; i<array.length; i++){
//            sortedArray[i] = array[i];
//        }
        int[]sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while (flag){
            flag = false;
            for (int i = 0; i< sortedArray.length-1; i++){
                if(sortedArray[i] <= sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

//    public static int[] sortIntegers(int[] array, int left, int right){
//        if( left < right){
//            int middle = (left + right)/ 2;
//            sortIntegers(array, left, middle);
//            sortIntegers(array, middle+1, right);
//
//            //Merge Function
//            helpSort(array, left, middle, right);
//        }
//
//        return array;
//    }
//
//     public static void helpSort(int[] array, int left, int middle, int right){
//        int leftArrLen = middle - left +1 ;
//        int rightArrLen = right - middle-1;
//
//        int[] leftArr = new int[leftArrLen];
//        int[] rightArr = new int[rightArrLen];
//
//        for(int i = 0; i < leftArrLen; i++){
//            leftArr[i] = array[left + i];
//        }
//        for(int i = 0; i < rightArrLen; i++){
//             rightArr[i] = array[middle + 1 + i];
//         }
//
//        int leftIndex = 0;
//        int rightIndex = 0;
//
//        int currentIndex = 1;
//        while(leftIndex < leftArrLen && rightIndex < rightArrLen){
//            if(leftArr[leftIndex] <= rightArr[rightIndex]){
//                array[currentIndex]  = leftArr[leftIndex];
//                leftIndex++;
//            }
//            else{
//                array[currentIndex]  = rightArr[rightIndex];
//                rightIndex++;
//            }
//            currentIndex++;
//        }
//
//        while(leftIndex <= leftArrLen){
//            array[currentIndex] = leftArr[leftIndex];
//            leftIndex++;
//            currentIndex++;
//        }
//         while(rightIndex <= rightArrLen){
//             array[currentIndex] = rightArr[rightIndex];
//             rightIndex++;
//             currentIndex++;
//         }
//
//
//     }


}
