package com.example31._SpringBoot_PP.service;


import com.example31._SpringBoot_PP.model.User;

import java.util.List;

public interface UserService {

    void addUser(User user);

    void deleteUserById(Long id);

    void updateUser(User user);

    List<User> getAllUsers();

    User getUserById(Long id);
}