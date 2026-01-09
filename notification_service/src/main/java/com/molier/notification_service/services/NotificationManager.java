package com.molier.notification_service.services;

import org.springframework.beans.factory.annotation.Autowired;

import java.lang.String;

// @Service
public class NotificationManager {
    private NotificationService notificationService;

    @Autowired
    public NotificationManager(NotificationService notificationService){
        this.notificationService = notificationService;
    }
    
    public void notify(String address, String message){
        notificationService.sendNotification(address, message);
    }
}
