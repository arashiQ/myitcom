package com.arashiq.Repository;

import com.arashiq.model.Company;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by A13054 on 2016/06/20.
 */
public interface CompanyRepository extends MongoRepository<Company, String> {
    Company findByUserId(Long userId);
}
