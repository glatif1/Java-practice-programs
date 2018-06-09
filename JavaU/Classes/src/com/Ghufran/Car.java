package com.Ghufran;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;


    //SETTERS
    public void setModel(String model){
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("commodore")){
            this.model = model;
        }else{
            this.model = "Unknown";
        }
    }

    public void setDoors(int doors){
        this.doors = doors;
    }

    public void setWheels(int wheels){
        this.wheels = wheels;
    }


    //GETTERS
    public String getModel() {
        return this.model;
    }

    public String getColor() {
        return this.color;
    }

    public String getEngine() {
        return this.engine;
    }
    public int getDoors(){
        return this.doors;
    }
}
