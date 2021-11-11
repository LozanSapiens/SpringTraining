package com.sapiens.training.setterDI;

public class DynamicMQMessaging implements Messaging{
    @Override
    public void sendMessage() {
        System.out.println("Sending DynamicMQMessaging");
    }
}
