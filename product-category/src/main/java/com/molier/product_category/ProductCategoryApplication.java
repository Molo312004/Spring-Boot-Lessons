package com.molier.product_category;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.molier.product_category.Entities.*;
import com.molier.product_category.Service.*;

@SpringBootApplication
public class ProductCategoryApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ProductCategoryApplication.class, args);

		var userService = context.getBean(UserService.class);
		userService.addUser();
		

	}

}
