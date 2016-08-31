package com.ydsworld.form;


import com.ydsworld.model.user.Role;
import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;

@Data
public class UserCreateForm {

    @NotEmpty
    private String username = "";

    @NotEmpty
    private String password = "";

    @NotEmpty
    private String passwordRepeated = "";

    @NotNull
    private boolean enabled = true;

    @NotNull
    private Role role = Role.ROLE_USER;

}
