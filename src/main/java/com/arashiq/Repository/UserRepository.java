package com.arashiq.Repository;

import com.arashiq.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by A13054 on 2016/06/20.
 */
public interface UserRepository extends JpaRepository<User, Long>{

    User findByUserName(String userName);

}
