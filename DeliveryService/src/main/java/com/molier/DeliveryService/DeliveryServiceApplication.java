package com.molier.DeliveryService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.molier.DeliveryService.Model.OrderService;

@SpringBootApplication
public class DeliveryServiceApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DeliveryServiceApplication.class, args);
		var orderService = context.getBean(OrderService.class);
		orderService.placeOrder("12345", "221B Baker Street, London");
	}

}
