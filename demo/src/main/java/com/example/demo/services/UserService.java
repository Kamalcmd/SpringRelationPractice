package com.example.demo.services;

import com.example.demo.entity.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();

    void addUser(User user);

    User getUserById(Long id);

    void delete(Long id);

    void update(Long id, User U);
}
