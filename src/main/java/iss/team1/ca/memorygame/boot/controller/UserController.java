package iss.team1.ca.memorygame.boot.controller;

import iss.team1.ca.memorygame.boot.bean.User;
import iss.team1.ca.memorygame.boot.service.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    IUserService userService;

    @PostMapping("/user")
    public User createAccount(String username){
        User user=new User();
        user.setUsername(username);
        userService.createAccount(user);
        return user;
    }
}
