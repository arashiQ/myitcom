package com.arashiq.service;

import com.arashiq.model.User;
import com.arashiq.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author arashiQ
 * @data 2016/06/20
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUser(Long userId){
        return userRepository.getOne(userId);
    }

    public User createuser(User user){
        return userRepository.save(user);
    }
}
