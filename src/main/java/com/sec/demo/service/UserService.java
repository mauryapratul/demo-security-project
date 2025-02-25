package com.sec.demo.service;

import com.sec.demo.dao.UserRepo;
import com.sec.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepo repo;

    public User saveUser(User user){
        return repo.save(user);
    }
}
