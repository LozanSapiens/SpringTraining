package com.sapiens.electricBulb;

public class ElectricPowerSwitch implements Switch{
    public Switchable client;
    public boolean on;

    public ElectricPowerSwitch(Switchable client) {
        this.client = client;
        this.on = false;
    }
    @Override
    public boolean isOn() {
        return this.on;
    }

    @Override
    public void press() {
        boolean checkOn = isOn();
        if(checkOn){
            client.turnOff();
            this.on = false;
        }else{
            client.turnOn();
            this.on = true;
        }

    }
    public static void main(String[] args) {

        Switchable switchableBulb = new LightBulb();
        Switch bulbPowerSwitch = new ElectricPowerSwitch(switchableBulb);
        bulbPowerSwitch.press();
        bulbPowerSwitch.press();

        Switchable switchableFan = new Fan();
        Switch fanPowerSwitch = new ElectricPowerSwitch(switchableFan);
        fanPowerSwitch.press();
        fanPowerSwitch.press();

        Switchable switchableCooler = new Fan();
        Switch coolerPowerSwitch = new ElectricPowerSwitch(switchableCooler);
        coolerPowerSwitch.press();
        coolerPowerSwitch.press();

        Switchable switchableTV = new Fan();
        Switch tvPowerSwitch = new ElectricPowerSwitch(switchableTV);
        tvPowerSwitch.press();
        tvPowerSwitch.press();

        Switchable switchableRefrigerator = new Fan();
        Switch refrigeratorPowerSwitch = new ElectricPowerSwitch(switchableRefrigerator);
        refrigeratorPowerSwitch.press();
        refrigeratorPowerSwitch.press();
    }
}

