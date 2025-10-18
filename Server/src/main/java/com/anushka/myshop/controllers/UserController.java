package com.anushka.myshop.controllers;

import com.anushka.myshop.payload.SingIn;
import com.anushka.myshop.payload.UserDto;
import com.anushka.myshop.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/auth")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<UserDto> signup(@RequestBody UserDto userDto) {
        UserDto createdUser = userService.CreateUser(userDto);
        return new ResponseEntity<>(createdUser, HttpStatus.OK);
    }

    @PostMapping("/signin")
    public ResponseEntity<SingIn> signin(@RequestBody SingIn singIn) {
        SingIn signedInUser = userService.SingIn(singIn);
        return new ResponseEntity<>(signedInUser, HttpStatus.OK);
    }
}
