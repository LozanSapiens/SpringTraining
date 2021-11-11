package com.sapiens.electricBulb;

public class Fan implements Switchable{
    @Override
    public void turnOn() {
        System.out.println("Fan Switched on");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan Switched off");
    }
}
