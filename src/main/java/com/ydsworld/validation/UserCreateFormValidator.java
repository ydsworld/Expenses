package com.ydsworld.validation;

import com.ydsworld.form.UserCreateForm;
import com.ydsworld.model.user.User;
import com.ydsworld.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class UserCreateFormValidator implements Validator{

    @Autowired
    private UserService userService;

    @Override
    public boolean supports(Class<?> aClass) {
        return aClass.equals(UserCreateForm.class);
    }

    @Override
    public void validate(Object object, Errors errors) {
        UserCreateForm form = (UserCreateForm) object;
        validateUsername(errors, form);
        validatePasswords(errors, form);
    }

    protected void validatePasswords(Errors errors, UserCreateForm form) {
        if(!form.getPassword().equals(form.getPasswordRepeated())){
            errors.rejectValue("passwordRepeated","passwordRepeated.no_match", "Passwords do not match");
        }
    }

    protected void validateUsername(Errors errors, UserCreateForm form) {
        User user = userService.getUserByUsername(form.getUsername());
        if(user != null){
            errors.rejectValue("username", "username.exists", "User with this username already exists");
        }
    }
}
