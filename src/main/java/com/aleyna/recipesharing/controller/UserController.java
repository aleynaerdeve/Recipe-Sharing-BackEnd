package com.aleyna.recipesharing.controller;

import com.aleyna.recipesharing.model.User;
import com.aleyna.recipesharing.repository.UserRepository;
import com.aleyna.recipesharing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/api/users/profile")
    public  User findUserByJwt(@RequestHeader("Authorization") String jwt) throws Exception{
        User user=userService.findUserByJwt(jwt);
        return user;
    }

/*    private UserRepository userRepository;
    @PostMapping("/users")
    public User createUser(@RequestBody User user) throws Exception {
        User isExist   = userRepository.findByEmail(user.getEmail());
        if(isExist!=null){
            throw new Exception("User exists with this email" +user.getEmail());
        }

        User savedUser=userRepository.save(user);

        return savedUser;

    }

    @DeleteMapping("/users/{userId}")
    public String deleteUser(@PathVariable Long userId) throws Exception {

        userRepository.deleteById(userId);
        return "User Deleted Succesfully";
    }

    @GetMapping("/users")
    public List<User> getAllUsers() throws Exception {

       List<User> users = userRepository.findAll();
       return users;
    }



    public User findByEmail(String email) throws  Exception{
        User user   = userRepository.findByEmail(email);
        if(user==null){
            throw new Exception("User not found with this email" +email);
        }
        return user;
    }*/
}
