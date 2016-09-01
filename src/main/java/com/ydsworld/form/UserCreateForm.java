package com.ydsworld.form;


import com.ydsworld.model.user.Role;
import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;

@Data
public class UserCreateForm {

    @NotEmpty(message = "Username can't be empty")
    private String username = "";

    @NotEmpty(message = "Password can't be empty")
    private String password = "";

    @NotEmpty(message = "Password can't be empty")
    private String passwordRepeated = "";

    @NotNull
    private boolean enabled = true;

    @NotNull
    private Role role = Role.ROLE_USER;

}
