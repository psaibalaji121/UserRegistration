package com.example.userregistration.service;

import com.example.userregistration.entity.User;
import com.example.userregistration.repository.UserRepsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepsitory userRepsitory;

    public User createUser(User user) {
        return userRepsitory.save(user);
    }
}
