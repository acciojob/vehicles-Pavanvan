package com.driver;

public class Car extends Vehicle {
    private int wheels;
    private String type;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;
    private int seats;

    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
        super(name);
        this.wheels = wheels;
        this.type = type;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
        this.seats = seats;
    }

    public void changeGear(int newGear) {
        if (newGear > 0 && newGear <= this.gears) {
            this.currentGear = newGear;
        } else {
            System.out.println("Invalid gear");
        }
    }

    public void changeSpeed(int newSpeed, int newDirection) {
        move(newSpeed, newDirection);
    }
}
