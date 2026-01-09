package com.molier.notification_service.services;


import java.lang.String;

// @Service("SmsService")
public class SmsService implements NotificationService {
    public void sendNotification(String address, String message){
        System.out.println("Sending message to: " + address);
        System.out.println("Message: " + message);
        System.out.println("Sending message through SMS Service");
    }
}
