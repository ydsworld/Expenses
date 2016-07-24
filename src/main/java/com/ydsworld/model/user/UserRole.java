package com.ydsworld.model.user;

import lombok.Data;

import java.util.Date;

@Data
public class UserRole {
    String name;
    String description;
    Date dateCreated;
    Date lastUpdated;
}
