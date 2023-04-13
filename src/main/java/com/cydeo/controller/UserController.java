package com.cydeo.controller;


import com.cydeo.dto.ProductDto;
import com.cydeo.dto.UserDto;
import com.cydeo.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users/api/v1")
public class UserController {




    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping
    public List<UserDto> getAllUsers(){

        return userService.getAllUsers();
    }
    //*********

}
