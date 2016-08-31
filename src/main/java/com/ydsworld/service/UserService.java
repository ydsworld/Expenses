package com.ydsworld.service;

import com.ydsworld.form.UserCreateForm;
import com.ydsworld.model.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUserByUsername(String username) {
        return (User)userRepository.findByUsername(username);
    }

    public User create(UserCreateForm form){
        User user = new User();
        user.setUsername(form.getUsername());
        user.setPassword(form.getPassword());
        user.setEnabled(form.isEnabled());
        user.setRole(form.getRole());
        return userRepository.save(user);
    }
    
}
