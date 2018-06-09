package com.Ghufran;

public class Car {
    private String name;
    private int cylinders;
    private int wheels;
    private boolean engine;

    public Car(String name, int cylinders, int wheels) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = wheels;
        this.engine = true;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }


    public void startEngine(){
        System.out.println("Starting Engine!");
    }
    public void accelerate(int rate ){
        System.out.println(" Accelerating at a rate of " + rate);

    }
    public void brake(){
        System.out.println("Braking Car");
    }


}

class Ferrari extends Car{
    public Ferrari(){
        super("Ferrari", 6,4);
    }

    @Override
    public void accelerate(int rate) {
        System.out.println("Accelerating in sports mode at a rate of " + rate*2.5);
    }
}

class porsche extends Car{
    public porsche(){
        super("Porsche", 6,4);
    }

    @Override
    public void accelerate(int rate) {
        System.out.println("Accelerating at a rate of " + rate*2);
    }

}

class nissan extends Car{
    public nissan(){
        super("Nissan GTR", 6,4);
    }

    @Override
    public void accelerate(int rate) {
        System.out.println("Accelerating in sports mode at a rate of " + rate*2.5);
    }
}

class tesla extends Car{
    public tesla(){
        super("Tesla",0,4);
    }

    @Override
    public void accelerate(int rate) {
        System.out.println("Accelerating at a rate of "+ rate*3);
    }

    @Override
    public void startEngine() {
        System.out.println("Starting electric engine silently");
    }
}

class Ford extends Car{
    public Ford(){
        super("Ford",0,4);
    }


    @Override
    public void accelerate(int rate) {
        System.out.println("Accelerating at a rate of "+ rate*3);
    }

    @Override
    public void startEngine() {
        System.out.println("Starting electric engine silently");
    }
}