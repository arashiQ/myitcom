package com.arashiq.Repository;

import com.arashiq.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by A13054 on 2016/06/20.
 */
public interface EmployeeRepository extends MongoRepository<Employee, Long> {

    List<Employee> findByUserId(Long userId);

}
