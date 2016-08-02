package com.arashiq.Repository;

import com.arashiq.model.City;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by A13054 on 2016/06/20.
 */
public interface CityRepository extends MongoRepository<City, String> {
}
