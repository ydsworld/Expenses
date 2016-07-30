package com.ydsworld.model.user;


import lombok.Data;

import java.util.Date;

@Data
public class User {
    private String firstName;
    private String lastName;
    private String username;
    private String passwordHash;
    private String email;
    private String phonenumber;
    private Date dateCreated;
    private Date lastUpdated;
}
