package com.ydsworld.model.user;


import lombok.Data;

import java.util.Date;

@Data
public class User {
    String firstName;
    String lastName;
    String username;
    String passwordHash;
    String email;
    String phonenumber;
    Date dateCreated;
    Date lastUpdated;
}
