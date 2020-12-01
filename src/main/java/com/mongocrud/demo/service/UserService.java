package com.mongocrud.demo.service;

import com.mongocrud.demo.model.User;
import com.mongocrud.demo.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public List<User> getAllUsers(){
        return userRepo.findAll();
    }

    public Optional<User> getUserById(Integer id){
        return userRepo.findById(id);
    }

    public User addUser(User user){
        return userRepo.save(user);
    }
    public User updateUser(User user){
        return userRepo.save(user);
    }
    public void deleteUser(Integer id){
        userRepo.deleteById(id);
    }
}
