package com.molier.notification_service.services;
import java.lang.String;

public interface NotificationService {
    void sendNotification(String address, String message);
}
