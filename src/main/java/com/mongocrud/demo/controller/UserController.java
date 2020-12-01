package com.mongocrud.demo.controller;

import com.mongocrud.demo.model.User;
import com.mongocrud.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public List<User> getAllUser(){
        return userService.getAllUsers();
    }

    @GetMapping("/user/{id}")
    public Optional<User> getUser(@PathVariable Integer id){
        return userService.getUserById(id);
    }

    @PostMapping("/add")
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @PutMapping("/add/{id}")
    public User updateUser(@RequestBody User user, @PathVariable Integer id){
        return userService.updateUser(user);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable Integer id){
        userService.deleteUser(id);
    }
}
