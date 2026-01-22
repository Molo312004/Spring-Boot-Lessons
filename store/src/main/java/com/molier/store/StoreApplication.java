package com.molier.store;

import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.molier.store.entities.*;
import com.molier.store.repositories.*;
import java.time.LocalDate;
import com.molier.store.service.*;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
		// // SpringApplication.run(StoreApplication.class, args);
		// // ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
		// var user = User.builder()
		// 		.name("Molo Moler")
		// 		.email("312004molo@gmail.com")
		// 		.password("password123")
		// 		.build();

		// var address = Address.builder()
		// 		.street("123 Main St")
		// 		.city("Springfield")
		// 		.state("IL")
		// 		.zip("62701")
		// 		.build();

		// user.addTag("Adidas");
		// user.addTag("Nike");
		// user.removeTag("Adidas");

		// var profile = Profile.builder()
		// 		.bio("Hello my name is Moloyimdang M Molier")
		// 		.build();

		// user.setProfile(profile);
		// profile.setUser(user);
		// System.out.println(user);
		ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
		// var userRepo = context.getBean(UserRepository.class);
		

		// Profile profile = Profile.builder()
		// 		.bio("Hello, I'm Molo Molier, a passionate developer.")
		// 		.build();
		// User user = User.builder()
		// 		.name("Molo Molier")
		// 		.email("312004molo@gmail.com")
		// 		.password("1234")
		// 		.build();

		// Profile profile = Profile.builder()
		// 		.bio("Hello, I'm Molo Molier, a passionate developer.")
		// 		.phoneNumber("123-456-7890")
		// 		.dateOfBirth(LocalDate.of(1990, 1, 1))
		// 		.loyaltyPoints(100)
		// 		.user(user)
		// 		.build();
				
		// user.setProfile(profile);
		// profile.setUser(user);
		// userRepo.save(user);
		// System.out.println("User saved with ID: " + user.getId());

		// var userRepo = context.getBean(UserRepository.class);
		// var addressRepo = context.getBean(AddressRepository.class);
		// UserService addressService = context.getBean(UserService.class);
		// addressService.findAddress(2L);
		var service = context.getBean(UserService.class);
		// service.persistUserwithAddress();
		service.deleteAddressOnly();
	}
}
