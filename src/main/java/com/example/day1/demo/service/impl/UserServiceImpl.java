package com.example.day1.demo.service.impl;

import com.example.day1.demo.domain.User;
import com.example.day1.demo.repository.UserRepository;
import com.example.day1.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepo;

//    public UserServiceImpl(UserRepository userRepo) {
//        this.userRepo = userRepo;
//    }

    @Override
    public User createUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepo.findAll();
    }

    @Override
    public User getUserById(int id) {
        Optional<User> usersResult = userRepo.findById(id);
        if (usersResult.isPresent()) {
            return usersResult.get();
        } else {
            return null;
        }
    }

    @Override
    public User updateUser(User user, int id) {
        Optional<User> userResult = userRepo.findById(id);
        if (userResult.isPresent()) {
            User savedUser = userResult.get();
            savedUser.setName(user.getName());
            savedUser.setAge(user.getAge());
            savedUser.setDateOfBirth(user.getDateOfBirth());
            return userRepo.save(savedUser);
        } else {
            return null;
        }

    }
    @Override
    public void deleteUser (int id){
        userRepo.deleteById(id);
    }
}
