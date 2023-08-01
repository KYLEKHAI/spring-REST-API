package com.springapi.SpringAPI.service;

import com.springapi.SpringAPI.api.model.User;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    
    private List<User> userList;

    public UserService() {
        userList = new ArrayList<>();

        //Adding user examples
        User user1 = new User(1, "Client", 25, "client@gmail.com");
        User user2 = new User(2, "Guy A", 18, "guya@gmail.com");
        User user3 = new User(3, "Guy B", 45, "guyb@gmail.com");
        User user4 = new User(4, "Guy C", 32, "guyc@gmail.com");
        User user5 = new User(5, "Girl D", 18, "girld@gmail.com");

        userList.addAll(Arrays.asList(user1,user2,user3,user4,user5));
    }

}
