package com.ydsworld.validation;

import com.ydsworld.form.UserCreateForm;
import com.ydsworld.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class UserCreateFormValidatorTest {

    @Mock
    private UserService userService;
    
    private UserCreateForm userCreateForm;

    @InjectMocks
    UserCreateFormValidator userCreateFormValidator;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void validatePasswords_shouldReturnErrorWhenPasswordDoNotMatch() {
        userCreateForm = getUserCreateForm();
        Errors errors = new BeanPropertyBindingResult(userCreateForm, "invalidForm");
        userCreateFormValidator.validatePasswords(errors, userCreateForm);
        assertEquals(errors.getFieldError().getCode(), "passwordRepeated.no_match");
    }

    @Test
    public void validatePasswords_shouldNotReturnErrorWhenPasswordDoMatch() {
        userCreateForm = getUserCreateForm();
        userCreateForm.setPasswordRepeated("password");
        Errors errors = new BeanPropertyBindingResult(userCreateForm, "validForm");
        userCreateFormValidator.validatePasswords(errors, userCreateForm);
        assertEquals(errors.getErrorCount(), 0);
    }


    private UserCreateForm getUserCreateForm() {
        userCreateForm = new UserCreateForm();
        userCreateForm.setUsername("username");
        userCreateForm.setPassword("password");
        userCreateForm.setPasswordRepeated("wrongPassword");
        return userCreateForm;
    }


}