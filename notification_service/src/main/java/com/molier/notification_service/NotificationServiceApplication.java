package com.molier.notification_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.molier.notification_service.services.NotificationManager;
import java.lang.String;

@SpringBootApplication
public class NotificationServiceApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(NotificationServiceApplication.class, args);
		var notificationManager = context.getBean(NotificationManager.class);
		notificationManager.notify("312004molo@gmail.com", "Hello how are you");
	}

}
