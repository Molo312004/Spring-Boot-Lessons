package com.molier.notification_service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.molier.notification_service.services.*;
@Configuration
public class AppConfig {
    @Bean
    public EmailService emailService() {
        return new EmailService();
    }
    @Bean
    public SmsService smsService(){
        return new SmsService();
    }

    

    @Bean
    public NotificationManager notificationManager(@Value("${notification.service.type}") String notificationType){
        if(notificationType.equals("EmailService")){
            return new NotificationManager(emailService());
        } else {
            return new NotificationManager(smsService());
        }
    }
}
