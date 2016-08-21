package com.ydsworld.model.user;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="users")
public class User {

    @Id
    @Column(name="username")
    private String username;
    private String password;
 //   private String email;
//    private String phonenumber;
//    private Date dateCreated;
//    private Date lastUpdated;
//    private String firstName;
//    private String lastName;
    @Enumerated(EnumType.STRING)
    private Role role;

    private Boolean enabled;
}
