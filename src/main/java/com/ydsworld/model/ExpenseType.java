package com.ydsworld.model;

import com.ydsworld.model.user.User;
import lombok.Data;

@Data
public class ExpenseType {
    String name;
    String description;
    User user;
}
