package com.sec.demo.service;

import com.sec.demo.dao.UserRepo;
import com.sec.demo.model.User;
import com.sec.demo.model.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepo repo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       User user=  repo.findByUsername(username);
       if(user == null){
           System.out.println("User 404");
           throw new UsernameNotFoundException("User 404");
       }
        return new UserPrincipal(user);
    }
}
