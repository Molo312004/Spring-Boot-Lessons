package com.molier.UserRegistration;

import org.springframework.stereotype.Component;


import com.molier.UserRegistration.Models.User;
@Component
public interface NotificationService {
   void sendNotification(String text, User user);
}
