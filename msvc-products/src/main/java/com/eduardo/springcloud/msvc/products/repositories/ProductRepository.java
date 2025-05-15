package com.eduardo.springcloud.msvc.products.repositories;

import com.eduardo.springcloud.msvc.products.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
    
}
