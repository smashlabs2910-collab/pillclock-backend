package com.smashlabs.pillclockbackend.service;

import com.smashlabs.pillclockbackend.entity.User;

public interface UserService {
    User saveUser(String username, String email, String password);
    User validateUserCredentials(String username, String rawPassword);
    User findById(String userId);
}
