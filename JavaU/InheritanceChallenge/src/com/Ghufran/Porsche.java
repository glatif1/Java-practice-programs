package com.Ghufran;

public class Porsche extends Car {
    private int driftSpeed;
    private int handling;
    private int test;

    public Porsche(int doors, String driveTerrain, String typeOfCar, int changeGears, int moving, int steering, int driftSpeed, int handling, int test) {
        super(doors, driveTerrain, typeOfCar, 1, moving, steering);
        this.driftSpeed = driftSpeed;
        this.handling = handling;
        this.test = test;
    }

    public int getDriftSpeed() {
        return driftSpeed;
    }

    public void setDriftSpeed(int driftSpeed) {
        this.driftSpeed = driftSpeed;
    }

    public int getHandling() {
        return handling;
    }

    public void setHandling(int handling) {
        this.handling = handling;
    }

    public int getTest() {
        return test;
    }

    public void setTest(int test) {
        this.test = test;
    }
}
