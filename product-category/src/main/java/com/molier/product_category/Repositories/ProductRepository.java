package com.molier.product_category.Repositories;

import org.springframework.data.repository.CrudRepository;
import com.molier.product_category.Entities.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
    
}
