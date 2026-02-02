package com.spring_student_activity_api.controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring_student_activity_api.dto.UserRoleView;
import com.spring_student_activity_api.model.User;
import com.spring_student_activity_api.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/findByUserUsername")
    public Optional<User> findByUserUsername(@RequestParam(value = "username", defaultValue = "") String username) {
        return this.userService.findByUserUsername(username);
    }

    @GetMapping("findProjectedByUserUsername")
    public Optional<UserRoleView>  findProjectedByUserUsername(@RequestParam(value = "username", defaultValue = "") String username) {
        return this.userService.findProjectedByUserUsername(username);
    }

}
