package com.sapiens.training.setterDI;

public class UniqueMQMessaging implements Messaging{
    @Override
    public void sendMessage() {
        System.out.println("Sending UniqueMQMessaging");
    }
}
