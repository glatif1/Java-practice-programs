package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(area(4,5));

    }
    public static double area(double radius){
        if(radius< 0)
            return -1;
        else{
            double area = Math.PI * Math.pow(radius, 2);
            return area;
        }
    }
    public static double area(double width, double height){
        if(width< 0 || height < 0)
            return -1;
        else{
            double area = width*height;
            return area;
        }
    }
}
