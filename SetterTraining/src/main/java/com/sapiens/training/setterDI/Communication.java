package com.sapiens.training.setterDI;

public class Communication {
    private Messaging messaging;

    //getter and setter for Messaging
    public Messaging getMessaging() {
        return messaging;
    }

    //DI Via Setter
    public void setMessaging(Messaging messaging) {
        this.messaging = messaging;
    }
    public void communication(){
        messaging.sendMessage();
    }
}
