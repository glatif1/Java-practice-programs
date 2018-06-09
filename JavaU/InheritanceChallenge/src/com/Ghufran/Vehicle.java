package com.Ghufran;

public class Vehicle {
    private int seats;
    private String color;
    private int wheels;

    public Vehicle(int seats, String color, int wheels) {
        this.seats = seats;
        this.color = color;
        this.wheels = wheels;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
}
