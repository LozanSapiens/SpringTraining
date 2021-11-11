package com.sapiens.electricBulb;

public class LightBulb implements Switchable{

    @Override
    public void turnOn() {
        System.out.println("Light Bulb turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Light Bulb turned off");

    }
}
