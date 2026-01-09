package com.molier.notification_service.services;


// @Service("mail")
// @Primary
public class EmailService implements NotificationService {

    public void sendNotification(String address, String message){
        System.out.println("Sending message to: " + address);
        System.out.println("Message: " + message);
        System.out.println("Sending message through Email Service");
    }
}
