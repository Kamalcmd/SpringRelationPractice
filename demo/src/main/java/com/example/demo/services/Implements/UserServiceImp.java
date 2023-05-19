package com.example.demo.services.Implements;

import com.example.demo.entity.Product;
import com.example.demo.entity.User;
import com.example.demo.repositories.UserRipo;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserRipo userRipo;
    @Override
    public List<User> getUsers() {
        return userRipo.findAll();
    }

    @Override
    public void addUser(User user) {
        userRipo.save(user);
    }

    @Override
    public User getUserById(Long id) {
        return userRipo.findById(id).get();
    }

    @Override
    public void delete(Long id) {
        userRipo.deleteById(id);
    }

    @Override
    public void update(Long id, User U) {
        U.setId(id);
        userRipo.save(U);
    }

}
