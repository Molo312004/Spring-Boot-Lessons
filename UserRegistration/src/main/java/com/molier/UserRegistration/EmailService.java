package com.molier.UserRegistration;

import com.molier.UserRegistration.Models.User;
import org.springframework.stereotype.Service;

@Service
public class EmailService implements NotificationService{
    public void sendNotification(String text, User user){
        String name = user.getUserName();
        String email = user.getEmail();

        System.out.println(text);
        System.out.println("Recepient: " + name + "\n" + email);
        System.out.println(user.getPassword()); //very bad practice to print password in real world applications lol
    }
}
