package com.arashiq.Repository;

import com.arashiq.model.Event;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by A13054 on 2016/06/20.
 */
public interface EventRepository extends MongoRepository<Event, String> {
}
