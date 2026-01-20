package com.molier.store;

import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.molier.store.entities.*;
import java.time.LocalDate;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
		// SpringApplication.run(StoreApplication.class, args);
		// ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
		var user = User.builder()
				.name("Molo Moler")
				.email("312004molo@gmail.com")
				.password("password123")
				.build();

		var address = Address.builder()
				.street("123 Main St")
				.city("Springfield")
				.state("IL")
				.zip("62701")
				.build();

		user.addTag("Adidas");
		user.addTag("Nike");
		user.removeTag("Adidas");

		var profile = Profile.builder()
				.bio("Hello my name is Moloyimdang M Molier")
				.build();

		user.setProfile(profile);
		profile.setUser(user);
		System.out.println(user);

	}

}
