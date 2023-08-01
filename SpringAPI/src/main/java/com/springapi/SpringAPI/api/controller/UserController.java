package com.springapi.SpringAPI.api.controller;

import com.springapi.SpringAPI.api.model.User;
import com.springapi.SpringAPI.service.UserService;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    
    private UserService userService;

    //Injects userservice service into the controller
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    //Allows for GET calls to API setup
    @GetMapping("/user") 
    public User getUser(@RequestParam Integer id) {
        Optional user = userService.getUser(id);
        
        if (user.isPresent()) {
            return (User) user.get();
        }

        return null;
    }
}
