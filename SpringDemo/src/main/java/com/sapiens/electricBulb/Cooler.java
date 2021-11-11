package com.sapiens.electricBulb;

public class Cooler implements Switchable{
    @Override
    public void turnOn() {
        System.out.println("Cooler Switched on");
    }

    @Override
    public void turnOff() {
        System.out.println("Cooler Switched off");
    }
}
