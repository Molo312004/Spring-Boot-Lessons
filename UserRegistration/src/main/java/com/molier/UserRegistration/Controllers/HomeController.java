package com.molier.UserRegistration.Controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.molier.UserRegistration.Models.User;
import com.molier.UserRegistration.Repo.*;
import com.molier.UserRegistration.NotificationService;

@RestController
@RequestMapping("/")
public class HomeController {
    private final UserRepo userRepo;
    private final NotificationService notificationService;

    public HomeController(UserRepo userRepo, NotificationService notificationService){
        this.userRepo = userRepo;
        this.notificationService = notificationService;
    }

    @PostMapping("/register")
    public User register(@RequestBody User user){
        String text= "User Registration Successful";
        notificationService.sendNotification(text, user);
        return userRepo.save(user);
    }

}
