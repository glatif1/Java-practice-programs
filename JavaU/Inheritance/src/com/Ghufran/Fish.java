package com.Ghufran;

public class Fish extends Animal{
    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int wieght, int gills, int eyes, int fins) {

        super(name, 1, 1, size, wieght);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest(){

    }

    private void moveMuscles(){
        System.out.println("Moving Muscles ");
    }

    private void moveBackFin(){
        System.out.println("Moving Back Fin");
    }

    private void swim(int speed){
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }

}
