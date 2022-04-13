package com.example.tema8.controller;

import com.example.tema8.model.User;
import com.example.tema8.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequiredArgsConstructor
public class UserController {
    private static List<User> users;
    private final UserService userService;

    @PostMapping("/init")
    public List<User> init(){
        Stream<User> userStream;
        userStream = Stream.generate(User::createUser).limit(3);
        users = userStream.collect(Collectors.toList());
        return users;
    }

    @PostMapping("/filterByAge")
    public List<User> filterByAge(){
        return userService.filterByAge(users);
    }

    @PostMapping("/doubleTheAge")
    public List<User> doubleTheAge(){
        return userService.doubleTheAge(users);
    }

    @PostMapping("/lastElement")
    public User lastElement(){
        return userService.lastElement(users);
    }

    @PostMapping("/getTheYoungest")
    public User getTheYoungest(){
        return userService.getTheYoungest(users);
    }

    @PostMapping("/getTheOldest")
    public User getTheOldest(){
        return userService.getTheOldest(users);
    }


    @PostMapping("/removeDuplicates")
    public List<User> removeDuplicates(){
        return userService.removeDuplicates(users);
    }

    @PostMapping("/filterUsers")
    public List<User> filterUsers(){
        return userService.filterUsers(users);
    }

}
