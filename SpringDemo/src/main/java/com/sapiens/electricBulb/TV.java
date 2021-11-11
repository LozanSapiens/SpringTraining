package com.sapiens.electricBulb;

public class TV implements Switchable{
    @Override
    public void turnOn() {
        System.out.println("TV Switched on");
    }

    @Override
    public void turnOff() {
        System.out.println("TV Switched off");
    }
}
