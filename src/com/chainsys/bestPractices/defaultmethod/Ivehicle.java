package com.chainsys.bestPractices.defaultmethod;

public interface Ivehicle {
    void start();
    default void move() {
        System.out.println("Vehicle is moving");
    }
    
}
class Car implements Ivehicle{
    @Override
    public void start() {
        System.out.println("Car is starting");
    }
}
class Bike implements Ivehicle{
    @Override
    public void start() {
        System.out.println("Bike is starting");
    }
}