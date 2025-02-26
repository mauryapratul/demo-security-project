package com.sec.demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int id;
    private String username;
    private String password;

    public String getUsername() {
       return this.username;
    }

    public String getPassword() {
        return  this.password;
    }

    public void setPassword(String password){
        this.password= password;
    }
}
