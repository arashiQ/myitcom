package com.arashiq.Repository;

import com.arashiq.model.Project;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by A13054 on 2016/06/20.
 */
public interface ProjectRepository extends MongoRepository<Project, String> {
    Project findByUserId(Long userId);
}
