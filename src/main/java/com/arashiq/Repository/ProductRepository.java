package com.arashiq.Repository;

import com.arashiq.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by A13054 on 2016/06/20.
 */
public interface ProductRepository extends MongoRepository<Product, String> {
    List<Product> findByUserId(Long userId);
}
