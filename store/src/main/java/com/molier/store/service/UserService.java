package com.molier.store.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.molier.store.entities.Address;
import com.molier.store.repositories.AddressRepository;
import com.molier.store.repositories.*;
import com.molier.store.entities.*;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserService {

    private UserRepository userRepo;
    private AddressRepository addressRepo;

    @Transactional(readOnly = true)

    public void findAddress(Long id) {

        Address address = addressRepo.findById(id).orElseThrow(() -> new RuntimeException("Address not found"));
        System.out.println("Address: " + address.getStreet() + ", " + address.getCity() + ", " + address.getState() + " - " + address.getPincode());
    }

    public void persistUserwithAddress(){
        //This method can be used to persist user with address
        
        User user = User.builder()
				.name("Nokzener Molier")
				.email("1234@gmail.com")
				.password("password123")
				.build();

		Address address1 = Address.builder()
				.street("4th Mile")
				.city("Chumukedima")
				.state("Nagaland")
				.pincode("797103")
				.build();

		user.addAddress(address1);

		userRepo.save(user);
		System.out.println("User with address saved with ID: " + user.getId());
    }

    public void deletedRelated(){
        userRepo.deleteById(12L);
    }
    
    @Transactional
    public void deleteAddressOnly(){
        var user = userRepo.findById(13L).orElseThrow(() -> new RuntimeException("User not found"));
        var address = user.getAddress().get(0);
        user.removeAddress(address);
        userRepo.save(user);
    }
}
