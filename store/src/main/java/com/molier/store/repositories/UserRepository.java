package com.molier.store.repositories;

import org.springframework.data.repository.CrudRepository;
import com.molier.store.entities.User;

public interface UserRepository extends CrudRepository<User, Long> {
    
}
