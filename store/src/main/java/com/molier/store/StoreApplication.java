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

		var profile = Profile.builder()
				.bio("Hello my name is Molo Molier. I am a Software Engineer")
				.dateOfBirth(LocalDate.of(2004, 01, 03))
				.phoneNumber("123456789")
				.loyaltyPoints(9999)
				.build();

		var tag1 = Tag.builder()
				.name("New Arrival")
				.build();

		System.out.println(user.getName() + "\n" + user.getEmail());
		System.out.println(profile.getBio());
		System.out.println(profile.getDateOfBirth());

	}

}
