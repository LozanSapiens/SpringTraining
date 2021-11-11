package com.sapiens.training.setterDI;

public class StaticMQMessaging implements Messaging{
    @Override
    public void sendMessage() {
        System.out.println("Sending StaticMQMessaging");
    }
}
