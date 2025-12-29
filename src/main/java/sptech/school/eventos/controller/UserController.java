package sptech.school.eventos.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sptech.school.eventos.model.User;
import sptech.school.eventos.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;
    public UserController(UserService userService){
        this.userService = userService;
    }
    @PostMapping
    public User CreateUser(@RequestBody User user){
        return userService.createdUser(user);
    }



}
