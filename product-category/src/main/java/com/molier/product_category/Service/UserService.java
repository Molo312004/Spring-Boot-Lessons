package com.molier.product_category.Service;

import org.springframework.stereotype.Service;

import com.molier.product_category.Entities.*;
import com.molier.product_category.Repositories.*;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@Service
public class UserService {
    
    private final UserRepository userRepository;
    

    @Transactional
    public void addUser(){
        var user = new User();
        var product = new Product();
        product.setName("Sample Product");
        product.setPrice(99.99f);
        
        user.addProduct(product);
        userRepository.save(user);
        System.out.println("User and Product saved successfully.");
    }

    // public void deleteUser(Long userId){
    //     userRepository.deleteById(userId);
    // }
}
