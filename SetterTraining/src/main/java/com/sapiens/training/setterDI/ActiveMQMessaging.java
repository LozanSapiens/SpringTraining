package com.sapiens.training.setterDI;

public class ActiveMQMessaging implements Messaging{
    @Override
    public void sendMessage() {
        System.out.println("Sending ActiveMQMessaging");
    }
}
