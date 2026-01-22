package com.molier.product_category.Repositories;

import org.springframework.data.repository.CrudRepository;
import com.molier.product_category.Entities.User;

public interface UserRepository extends CrudRepository<User, Byte> {
    
}
