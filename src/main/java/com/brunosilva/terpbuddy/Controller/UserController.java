package com.brunosilva.terpbuddy.Controller;


import com.brunosilva.terpbuddy.Entities.User;
import com.brunosilva.terpbuddy.Repository.UserRepository;
import com.brunosilva.terpbuddy.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // ----------------------
    // Create / Register User
    // ----------------------
    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
        return userService.registerUser(user);
    }

    // ----------------------
    // Get User by ID
    // ----------------------
    @GetMapping("/{id}")
    public Optional<User> getUserById(@PathVariable Long id){
        return userService.getUserById(id);
    }

//    @GetMapping
//    public List<User> getAllUsers() {
//        return userService.getAllUsers();
//    }


    // ----------------------
    // Update User Profile
    // ----------------------
    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user){
        return userService.updateUser(id, user);
    }




}
