package com.ydsworld.model;

import com.ydsworld.model.user.User;
import lombok.Data;

@Data
public class ExpenseType {
    int id;
    String name;
    String description;
    User user;
}
