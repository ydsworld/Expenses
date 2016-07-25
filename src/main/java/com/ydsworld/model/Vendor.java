package com.ydsworld.model;

import com.ydsworld.model.user.User;
import lombok.Data;

@Data
public class Vendor {
    int id;
    String name;
    String description;
    User user;
    String addresss;
    String phone;
    String email;
}
