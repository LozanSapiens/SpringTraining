package com.sapiens.electricBulb;

public class Refrigerator implements Switchable{
    @Override
    public void turnOn() {
        System.out.println("Refrigerator turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Refrigerator turned off");
    }
}
