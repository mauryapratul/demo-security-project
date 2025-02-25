package com.sec.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class User {
    @Id
    private int id;
    private String username;
    private String password;

    public String getUsername() {
       return this.username = username;
    }

    public String getPassword() {
        return this.password= password;
    }
}
