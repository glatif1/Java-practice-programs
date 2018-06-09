package com.Ghufran;

public class Car extends Vehicle {
    private int doors;
    private String driveTerrain;
    private String typeOfCar;
    private int changeGears;
    private int moving;
    private int steering;

    public Car(int seats, String color, int wheels, int doors, String driveTerrain, String typeOfCar, int changeGears, int moving, int steering) {
        super(seats, color, wheels);
        this.doors = doors;
        this.driveTerrain = driveTerrain;
        this.typeOfCar = typeOfCar;
        this.changeGears = changeGears;
        this.moving = moving;
        this.steering = steering;
    }


    public int getChangeGears() {
        return changeGears;
    }

    public void setChangeGears(int changeGears) {
        this.changeGears = changeGears;
    }

    public int getMoving() {
        return moving;
    }

    public void setMoving(int moving) {
        this.moving = moving;
    }

    public int getSteering() {
        return steering;
    }

    public void setSteering(int steering) {
        this.steering = steering;
    }

    public String getTypeOfCar() {
        return typeOfCar;
    }

    public void setTypeOfCar(String typeOfCar) {
        typeOfCar.toLowerCase();
        if(typeOfCar == "sedan" ||typeOfCar == "suv"||typeOfCar == "coupe"){
            this.typeOfCar = typeOfCar;
        }
        System.out.println("Please enter Sedan, SUV or Coupe");

    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getDriveTerrain() {
        return driveTerrain;
    }

    public void setDriveTerrain(String driveTerrain) {
        driveTerrain.toLowerCase();
        if(driveTerrain == "awd" || driveTerrain == "fwd" ||driveTerrain == "rwd" ||driveTerrain == "4wd"){
            this.driveTerrain = driveTerrain;
        }
        System.out.println("Please enter AWD, FWD, RWD or 4WD");

    }


}
