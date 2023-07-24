package com.example.day1.demo.service;

import com.example.day1.demo.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    public User createUser(User user);

    public List<User> getAllUser();

    public User getUserById(int id);

    public User updateUser(User user,int id);

    public void deleteUser(int id);
}
