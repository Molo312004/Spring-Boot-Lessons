package com.molier.UserRegistration.Repo;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.molier.UserRegistration.Models.*;

public interface UserRepo extends JpaRepository<User, Long> {
    
}
