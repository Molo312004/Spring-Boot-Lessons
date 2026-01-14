package com.molier.UserRegistration;

import com.molier.UserRegistration.Models.User;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Value;

@Service
public class EmailService implements NotificationService{
    @Value("${mail.host}")
    String host;

    @Value("${mail.port}")  
    String port;
    public void sendNotification(String text, User user){
        
        String name = user.getUserName();
        String email = user.getEmail();

        System.out.println(text);
        System.out.println("Recepient: " + name + "\n" + email);
        System.out.println("host: " + host + " port: " + port); 
    }
}
